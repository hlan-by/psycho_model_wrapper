package percepts;

public class PerceptBuilder {
    //needs to be appended by Sense when feeling this
    private Percept[] percepts;
    private double signalLevel;


    public CombinatedPercept build(double strongValue, Percept... percepts) {
        this.percepts = percepts;
        this.signalLevel = strongValue;
        return getCombinatedPercept();
    }

    private CombinatedPercept getCombinatedPercept() {
        CombinatedPercept combinatedPercept = new CombinatedPercept();
        combinatedPercept.filterPerceptsBySignalLevel(percepts, signalLevel);
        return combinatedPercept;
    }
}
