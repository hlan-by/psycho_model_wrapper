package intentional_modules;

import desires.ConsumptionDesireBasic;
import desires.Desire;
import desires.ProtectionDesireBasic;
import desires.RecognitionDesireBasic;
import emotions.Affect;
import emotions.EmotionReceiver;
import emotions.core.CoreEmotion;
import feelings.Feeling;
import figures.Figure;
import figures.SpecificFigure;
import memories.MemoryService;
import percepts.Percept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntentionalModule {

    private Figure target;
    private Desire sourceDrive; // Dominant desire
    private List<Desire> desires;
    private Feeling feeling;

    private Goal goal;
    private double motivation;
    private Plan plan;
    private Action currentAction;

    private final MemoryService memory;

    public IntentionalModule(List<Figure> figures, List<Desire> desires, Feeling feeling, MemoryService memory) {
        this.desires = desires;
        this.feeling = feeling;
        this.memory = memory;
        
        // 1. Select Target (First, independent of specific desire for now, based on salience)
        this.target = selectTarget(figures);
        
        // 2. Select Dominant Desire (Context-sensitive to target)
        this.sourceDrive = selectDominantDesire(desires, target);

        // 3. Compute Motivation (Weighted by relevance)
        this.motivation = computeMotivation(feeling, desires, target);
        
        // 4. Resolve Goal
        if (target != null && sourceDrive != null) {
            this.goal = resolveGoal(target, sourceDrive, feeling);
            
            // 5. Build Plan
            this.plan = buildPlan(this.goal, memory);
        } else {
            this.goal = null;
            this.plan = new Plan();
        }
    }

    private Figure selectTarget(List<Figure> figures) {
        if (figures == null || figures.isEmpty()) {
            return null;
        }
        
        // Select figure maximizing intentionalValue * affect.energy
        return figures.stream()
                .max(Comparator.comparingDouble(f -> {
                    double value = f.getIntentionalValue();
                    double energy = (f.getAffect() != null) ? f.getAffect().getEnergy() : 1.0;
                    return value * energy;
                }))
                .orElse(null);
    }

    private Desire selectDominantDesire(List<Desire> desires, Figure target) {
        if (desires == null || desires.isEmpty()) {
            return null;
        }
        
        Map<Desire, Double> weights = (target != null) ? target.getDriveWeights() : Collections.emptyMap();

        // Select desire with max (impact - feedbackLevel) * relevance
        return desires.stream()
                .max(Comparator.comparingDouble(d -> {
                    double tension = d.getImpact() - d.getFeedBackLevel();
                    double relevance = weights.getOrDefault(d, (target == null ? 1.0 : 0.0));
                    // If target is null, treat all equally (relevance 1.0). 
                    // If target exists but has no weight for this desire, relevance is 0.
                    // Wait, if relevance is 0, we might ignore valid desires.
                    // Let's use a small epsilon or fallback logic.
                    // Or assume target selection implies relevance.
                    // For robustness: if weights map is empty (new figure), assume uniform relevance.
                    if (weights.isEmpty()) relevance = 1.0;
                    
                    return tension * relevance;
                }))
                .orElse(desires.get(0));
    }

    private double computeMotivation(Feeling feeling, List<Desire> desires, Figure target) {
        double motivation = 0.0;
        
        if (desires == null || target == null) {
             // Fallback to feeling energy if context missing
             return (feeling != null && feeling.getAffect() != null) ? feeling.getAffect().getEnergy() : 0.0;
        }

        Map<Desire, Double> weights = target.getDriveWeights();
        if (weights.isEmpty()) {
             // If no weights, use feeling energy as base
             return (feeling != null && feeling.getAffect() != null) ? feeling.getAffect().getEnergy() : 0.0;
        }

        for (Desire d : desires) {
            double tension = d.getImpact() - d.getFeedBackLevel();
            double relevance = weights.getOrDefault(d, 0.0);
            motivation += tension * relevance;
        }
        
        return motivation;
    }

    private Goal resolveGoal(Figure target, Desire desire, Feeling feeling) {
        GoalType type = GoalType.MAINTAIN;
        double desiredDelta = desire.getImpact() * 0.5; // Example logic

        if (desire instanceof ConsumptionDesireBasic) {
            type = GoalType.CONSUME;
        } else if (desire instanceof ProtectionDesireBasic) {
            type = GoalType.AVOID;
        } else if (desire instanceof RecognitionDesireBasic) {
            type = GoalType.INTERACT;
        }
        
        return new Goal(target, desire, type, desiredDelta);
    }

    private Plan buildPlan(Goal goal, MemoryService memory) {
        Plan newPlan = new Plan();
        
        if (goal == null) {
            return newPlan;
        }

        // Query memory for relevant figures
        List<SpecificFigure> similar = memory.findRelevant(
            goal.getTarget().getPercept(),
            goal.getDesire(),
            null, // KeyEmotion context could be added if available
            5 // topK
        );

        if (similar != null && !similar.isEmpty()) {
            // Extract actions from similar past figures
            for (SpecificFigure f : similar) {
                // Assuming Figure now stores Last Plan
                if (f.getLastPlan() != null) {
                    newPlan.addActions(f.getLastPlan().getSteps());
                } else {
                    List<Action> inferred = inferActionsFromFigure(f);
                    newPlan.addActions(inferred);
                }
            }
        }

        // Fallback if plan is empty
        if (newPlan.getSteps().isEmpty()) {
            newPlan.addActions(createFallbackPlan(goal));
        }
        
        return newPlan;
    }
    
    private List<Action> inferActionsFromFigure(SpecificFigure f) {
        // Placeholder inference logic
        List<Action> actions = new ArrayList<>();
        if (f.getActivationCount() > 5) {
             actions.add(new Action("Repeat successful interaction", "Interact"));
        }
        return actions;
    }

    private List<Action> createFallbackPlan(Goal goal) {
        List<Action> actions = new ArrayList<>();
        switch (goal.getType()) {
            case CONSUME:
                actions.add(new Action("Approach target", "Approach"));
                actions.add(new Action("Consume target", "Consume"));
                break;
            case AVOID:
                actions.add(new Action("Retreat from target", "Retreat"));
                break;
            case INTERACT:
                actions.add(new Action("Observe target", "Observe"));
                actions.add(new Action("Communicate", "Talk"));
                break;
            default:
                actions.add(new Action("Observe", "Observe"));
        }
        return actions;
    }

    public Action nextAction() {
        // Could be replaced with selectBestAction() if multiple options available
        // For now, next step in plan
        if (plan != null && !plan.isComplete()) {
            this.currentAction = plan.nextAction();
            return this.currentAction;
        }
        return null;
    }

    public void applyActionResult(ActionResult result) {
        if (result == null) return;
        
        Map<Desire, Double> weights = (target != null) ? target.getDriveWeights() : Collections.emptyMap();
        Map<Desire, Double> modifiers = result.getDriveModifiers();
        Map<Desire, Double> recordedImpact = new HashMap<>();

        if (desires != null) {
            for (Desire d : desires) {
                double weight = weights.getOrDefault(d, weights.isEmpty() ? 1.0 : 0.0);
                double modifier = (modifiers != null) ? modifiers.getOrDefault(d, 1.0) : 1.0;
                
                double delta = result.getSuccessDelta() * weight * modifier;
                
                double currentFeedback = d.getFeedBackLevel();
                d.setFeedBackLevel(currentFeedback + delta);
                
                recordedImpact.put(d, delta);
            }
        }
        
        // Trigger new CoreEmotion
        if (target != null && sourceDrive != null) {
            CoreEmotion newEmotion = EmotionReceiver.create(target, sourceDrive);
            // In a real cycle, this would feed into the next feeling calculation
        }

        // Evaluate and Replan
        evaluateAndReplan(result);
        
        // Save execution context to memory
        if (target != null && currentAction != null) {
             target.setLastAction(currentAction);
             target.setLastPlan(plan);
             target.setLastDriveImpact(recordedImpact);
             memory.saveOrUpdate(target);
        }
    }
    
    private void evaluateAndReplan(ActionResult result) {
        if (shouldReplan(result)) {
            System.out.println("Replanning due to failure or low success...");
            this.plan = buildPlan(this.goal, memory);
        }
    }

    private boolean shouldReplan(ActionResult result) {
        return result.getSuccessDelta() < 0;
    }

    // Getters
    public Figure getTarget() {
        return target;
    }

    public Goal getGoal() {
        return goal;
    }

    public double getMotivation() {
        return motivation;
    }

    public Plan getPlan() {
        return plan;
    }
}
