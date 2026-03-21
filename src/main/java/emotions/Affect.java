package emotions;

public class Affect {
    private final double value;
    private final double energy;

    public Affect(double value, double energy) {
        this.value = value;
        this.energy = energy;
    }

    public double getValue() {
        return value;
    }

    public double getEnergy() {
        return energy;
    }
}
