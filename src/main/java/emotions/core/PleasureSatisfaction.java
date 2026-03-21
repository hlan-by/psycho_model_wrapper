package emotions.core;

import percepts.Percept;

public class PleasureSatisfaction extends BaseCoreEmotion implements Euphoric {
    double level;

    public PleasureSatisfaction(Percept percept) {
        super(percept);
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public void setUnpleasureLevel() {
        level = -10E19;//todo setup correct value
    }
}
