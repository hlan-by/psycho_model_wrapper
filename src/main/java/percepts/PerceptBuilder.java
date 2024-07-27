package percepts;

// PerceptBuilder for creating complex percepts
public class PerceptBuilder {
    private CombinedPercept combinedPercept;

    public PerceptBuilder(String type) {
        this.combinedPercept = new CombinedPercept(type);
    }

    public PerceptBuilder addPercept(String key, Percept percept) {
        combinedPercept.addPercept(key, percept);
        return this;
    }

    public CombinedPercept build() {
        return combinedPercept;
    }
}
