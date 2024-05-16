package percepts;

public interface Percept {

    static boolean getStrongSignal(Percept percept, double signalLevel) {
        return percept.getSignalLevel()>signalLevel;
    }

    double getSignalLevel();
}
