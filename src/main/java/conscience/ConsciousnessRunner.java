package conscience;

import emotions.core.CoreEmotion;
import feelings.Feeling;
import feelings.SpecificFeeling;
import figures.Figure;
import neuralnetwork.NeuralNetworkSelectFigureByAttension;

import java.util.Collections;
import java.util.Set;

public class ConsciousnessRunner implements Runnable {
    private static final long UPDATE_SELF_AWARE_ENTITY_PERIOD = 10;
    private IAm entity;
    private boolean running = true;

    public ConsciousnessRunner(IAm entity) {
        this.entity = entity;
    }

    @Override
    public void run() {
        while (running) {
            try {
                Thread.sleep(UPDATE_SELF_AWARE_ENTITY_PERIOD); // 10 ms delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }

            Feeling currentFeel = entity.getCurrentFeel();
            entity.compareFeels();
            entity.setPreviousFeel(currentFeel); // Update previousFeel to currentFeel
        }
    }

    public void stop() {
        running = false;
    }

    public static void main(String[] args) {
        // Usage example
        CoreEmotion specificEmotion = null;
        Set<Figure> figures = Collections.emptySet();
        Attention attention = new Attention(null, new NeuralNetworkSelectFigureByAttension());
        IAm selfAwareEntity = new SelfAwareEntity(specificEmotion, figures, attention);

        // Setup base feels
        Feeling initialFeel = new SpecificFeeling(); //todo setup parameters
        selfAwareEntity.setCurrentFeel(initialFeel);
        selfAwareEntity.setPreviousFeel(initialFeel);

        ConsciousnessRunner runner = new ConsciousnessRunner(selfAwareEntity);
        Thread runnerThread = new Thread(runner);
        runnerThread.start();

        Feeling newFeel = new SpecificFeeling(); //todo setup parameters
        selfAwareEntity.setCurrentFeel(newFeel);

        runner.stop();
    }
}