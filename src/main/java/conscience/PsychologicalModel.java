package conscience;

import desires.Desire;
import emotions.Affect;
import emotions.EmotionCalculator;
import emotions.EmotionReceiver;
import emotions.core.CoreEmotion;
import emotions.key.KeyEmotion;
import feelings.Feeling;
import feelings.SpecificFeeling;
import figures.Figure;
import intentional_modules.Action;
import intentional_modules.ActionResult;
import intentional_modules.IntentionalModule;
import memories.MemoryService;
import memories.MemoryServiceImpl;
import memories.VectorDatabaseImpl;
import percepts.CombinedPercept;
import percepts.Percept;
import percepts.PerceptBuilder;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class PsychologicalModel {

    private final Attention attention;
    private final MemoryService memory;
    private Thinking thinking;
    private final Percept percept1;
    private final Percept percept2;
    private CoreEmotion emotion1;
    private KeyEmotion emotion2;
    private final Desire desire;
    // IntentionalModules are now created per cycle as they depend on current state
    private IntentionalModule activeModule;
    private Feeling feeling;


    public PsychologicalModel(Percept percept1, Percept percept2, Desire desire, Attention attention) {
        this.attention = attention;
        this.memory = new MemoryServiceImpl(new VectorDatabaseImpl());
        this.percept1 = percept1;
        this.percept2 = percept2;
        this.desire = desire;
        // Modules initialized in cycle
        runCycle();
    }

    public void runCycle() {
        // Prioritize percepts using attention
        List<Percept> prioritizedPercepts = attention.prioritize(percept1, percept2);
        Percept primaryPercept = prioritizedPercepts.get(0);
        Percept secondaryPercept = prioritizedPercepts.get(1);

        // Initialize Thinking with a null CoreEmotion for now
        this.thinking = new Thinking(
            attention,
            memory,
            null, // CoreEmotion is not yet known
            Collections.singletonList(desire)
        );

        // Process percepts into figures
        Figure figure1 = thinking.process(primaryPercept);
        Figure figure2 = thinking.process(secondaryPercept);

        // Now that we have an enriched figure, we can generate the CoreEmotion
        this.emotion1 = EmotionReceiver.create(figure1, desire);
        
        // Update the thinking context with the new CoreEmotion
        this.thinking = new Thinking(
            attention,
            memory,
            emotion1,
            Collections.singletonList(desire)
        );

        // Use the combined percept to create a third figure
        CombinedPercept combinedPercept = combinePercepts(primaryPercept, secondaryPercept);
        Figure combinedFigure = thinking.process(combinedPercept);

        // Generate key emotion based on the interaction of figures
        this.emotion2 = EmotionCalculator.calculateEmotion(figure1, combinedFigure);

        // Create feeling based on combined emotions
        if (emotion1 != null && emotion2 != null) {
            this.feeling = new SpecificFeeling(emotion1, emotion2);
            // Apply the feeling to update the figures and memory
            applyFeeling(this.feeling, figure1, figure2, combinedFigure);
            
            // Activate Intentional Module with multiple desires (single in this case, wrapped)
            List<Figure> availableFigures = Arrays.asList(figure1, figure2, combinedFigure);
            List<Desire> desires = Collections.singletonList(desire);
            
            this.activeModule = new IntentionalModule(availableFigures, desires, feeling, memory);
            
            // Execute Action
            Action nextAction = activeModule.nextAction();
            if (nextAction != null) {
                System.out.println("Executing Action: " + nextAction.getDescription());
                // Simulate execution result
                ActionResult result = simulateExecution(nextAction);
                activeModule.applyActionResult(result);
            }
        }
    }

    private ActionResult simulateExecution(Action action) {
        // Placeholder for real execution logic
        // Return a positive result for demonstration
        return new ActionResult(0.5, "Action successful");
    }

    private void applyFeeling(Feeling feeling, Figure... figures) {
        for (Figure figure : figures) {
            // a. Update Affect
            Affect currentAffect = figure.getAffect();
            Affect feelingAffect = feeling.getAffect();
            if (currentAffect != null && feelingAffect != null) {
                Affect updatedAffect = new Affect(
                    (currentAffect.getValue() + feelingAffect.getValue()) / 2,
                    currentAffect.getEnergy() + feelingAffect.getEnergy()
                );
                figure.setAffect(updatedAffect);
            }

            // b. Update Intentional Value
            figure.setIntentionalValue(figure.getIntentionalValue() + feeling.getAffect().getEnergy());

            // c. Strengthen connections (by increasing activation count)
            figure.setActivationCount(figure.getActivationCount() + 1);

            // d. Update Timestamp
            figure.setTimestamp(System.currentTimeMillis());

            // Persist changes to memory
            memory.saveOrUpdate(figure);
        }
    }

    private CombinedPercept combinePercepts(Percept... percepts) {
        PerceptBuilder builder = new PerceptBuilder();
        if (percepts.length > 0) {
            Arrays.stream(percepts).forEach(p -> builder.addPercept(UUID.randomUUID().toString(), p));
        }
        return builder.build();
    }

    public Feeling getFeeling() {
        return feeling;
    }
}
