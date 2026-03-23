package conscience;

import desires.Desire;
import emotions.Affect;
import emotions.core.CoreEmotion;
import figures.Figure;
import figures.SpecificFigure;
import memories.MemoryService;
import percepts.Percept;

import java.util.List;
import java.util.Optional;

public class Thinking {
    private final Attention attention;
    private final MemoryService memory;
    private final CoreEmotion currentCoreEmotion;
    private final List<Desire> activeDesires;

    public Thinking(Attention attention,
                    MemoryService memory,
                    CoreEmotion currentCoreEmotion,
                    List<Desire> activeDesires) {
        this.attention = attention;
        this.memory = memory;
        this.currentCoreEmotion = currentCoreEmotion;
        this.activeDesires = activeDesires;
    }

    public Figure process(Percept percept) {
        // Step 1: Memory Binding
        Optional<SpecificFigure> memoryResult = findInMemory(percept);
        SpecificFigure figure;

        if (memoryResult.isPresent()) {
            figure = memoryResult.get();
            figure.setActivationCount(figure.getActivationCount() + 1);
            figure.setTimestamp(System.currentTimeMillis());
            // In a real system, we might merge new percept details into the existing figure here
        } else {
            figure = new SpecificFigure().setPercept(percept);
            figure.setTimestamp(System.currentTimeMillis());
            figure.setActivationCount(1);
        }

        // Step 2: Assign Source Drive
        Desire sourceDrive = resolveSourceDrive(percept);
        figure.setSourceDrive(sourceDrive);

        // Step 3: Evaluate Needs Satisfaction
        evaluateNeeds(figure);

        // Step 4: Apply Attention (CRITICAL)
        attention.apply(figure);

        // Step 5: Assign Base Emotion
        if (currentCoreEmotion != null) {
            figure.setBaseEmotion(currentCoreEmotion);
        }

        // Step 6: Initialize Affect
        Affect initialAffect = computeInitialAffect(figure);
        figure.setAffect(initialAffect);

        // Step 8: Store / Update Memory
        if (memoryResult.isPresent()) {
            memory.update(figure);
        } else {
            memory.save(figure);
        }

        return figure;
    }

    public Figure process(Percept percept, Desire specificDesire) {
         // Legacy support or specific override
         SpecificFigure figure = (SpecificFigure) process(percept);
         if (specificDesire != null) {
             figure.setSourceDrive(specificDesire);
             // Re-evaluate needs based on this specific desire
             evaluateNeeds(figure); 
             
             // Re-calculate affect since source drive changed
             Affect initialAffect = computeInitialAffect(figure);
             figure.setAffect(initialAffect);
         }
         return figure;
    }

    private Optional<SpecificFigure> findInMemory(Percept percept) {
        if (memory == null) return Optional.empty();
        List<SpecificFigure> found = memory.findByPercept(percept, 1);
        return found.isEmpty() ? Optional.empty() : Optional.of(found.get(0));
    }

    private Desire resolveSourceDrive(Percept percept) {
        // Simple heuristic: match percept type to desire type if possible
        // For now, return the first active desire or null
        if (activeDesires != null && !activeDesires.isEmpty()) {
            return activeDesires.get(0);
        }
        return null;
    }

    private void evaluateNeeds(SpecificFigure figure) {
        if (activeDesires == null) return;

        for (Desire desire : activeDesires) {
            // Heuristic evaluation: assign a default satisfaction
            // In a real implementation, this would involve checking if the percept helps satisfy the desire
            int satisfaction = 50; // Default moderate satisfaction
            
            figure.setNeedSatisfaction(desire, satisfaction);
        }
    }

    private Affect computeInitialAffect(SpecificFigure figure) {
        double valence = 0.5; // Neutral
        double energy = 0.5; // Moderate

        // Adjust based on CoreEmotion
        if (currentCoreEmotion != null) {
            Affect coreAffect = currentCoreEmotion.getAffect();
            if (coreAffect != null) {
                valence = (valence + coreAffect.getValue()) / 2.0;
                energy = (energy + coreAffect.getEnergy()) / 2.0;
            }
        }

        // Adjust based on needs satisfaction of the source drive
        Desire source = figure.getSourceDrive();
        if (source != null) {
            int satisfaction = figure.getNeedSatisfaction(source);
            // Satisfaction > 50 increases valence, < 50 decreases
            double satisfactionFactor = (satisfaction - 50) / 100.0; 
            valence += satisfactionFactor;
        }

        // Clamp values
        valence = Math.max(0.0, Math.min(1.0, valence));
        energy = Math.max(0.0, Math.min(1.0, energy));

        return new Affect(valence, energy);
    }
}
