package percepts;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CombinatedPercept implements Percept {
    private double signalLevel;

    public List<Percept> getPerceps() {
        return perceps;
    }

    public void setPerceps(List<Percept> perceps) {
        this.perceps = perceps;
    }

    public void setSignalLevel(double signalLevel) {
        this.signalLevel = signalLevel;
    }

    private List<Percept> perceps;

    public void filterPerceptsBySignalLevel(Percept[] percepts, double signalLevel) {
        this.signalLevel = signalLevel;
        this.perceps = Arrays.stream(percepts)
                .filter(percept -> Percept.getStrongSignal(percept, signalLevel))
                .collect(Collectors.toList());
    }

    @Override
    public double getSignalLevel() {
        return signalLevel;
    }
}
