package feelings;

public class Pleasure {
    double level;

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public void setUnpleasureLevel() {
        level=-10E19;//todo setup correct value
    }
}
