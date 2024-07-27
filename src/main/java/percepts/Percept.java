package percepts;

public interface Percept {

    static boolean isStrongSignal(Percept percept, double threshold) {
        return percept.getSignalLevel() > threshold;
    }

    String getType();

    double getSignalLevel();
}
