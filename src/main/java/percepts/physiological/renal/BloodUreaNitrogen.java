package percepts.physiological.renal;

public class BloodUreaNitrogen {
    // Parameter for BUN level (mg/dL)
    private double bunLevel;

    // Constructor
    public BloodUreaNitrogen(double bunLevel) {
        this.bunLevel = bunLevel;
    }

    // Getter for BUN level
    public double getBunLevel() {
        return bunLevel;
    }

    // Setter for BUN level
    public void setBunLevel(double bunLevel) {
        this.bunLevel = bunLevel;
    }
}

