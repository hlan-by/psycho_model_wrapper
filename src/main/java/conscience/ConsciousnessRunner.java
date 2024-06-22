package conscience;

import feelings.Feeling;
import feelings.SpecificFeeling;

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
        IAm selfAwareEntity = new SelfAwareEntity();

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