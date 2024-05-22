package percepts.physiological.electrolyte_mineral;

public class Sodium {
    // Parameter for sodium level (mmol/L)
    private double sodiumLevel;

    // Constructor
    public Sodium(double sodiumLevel) {
        this.sodiumLevel = sodiumLevel;
    }

    // Getter for sodium level
    public double getSodiumLevel() {
        return sodiumLevel;
    }

    // Setter for sodium level
    public void setSodiumLevel(double sodiumLevel) {
        this.sodiumLevel = sodiumLevel;
    }
}

