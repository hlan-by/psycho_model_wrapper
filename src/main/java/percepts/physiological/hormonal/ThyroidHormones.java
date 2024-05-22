package percepts.physiological.hormonal;

public class ThyroidHormones {
    // Parameters for thyroid hormones T3 and T4 (ng/dL)
    private double t3Level;
    private double t4Level;

    // Constructor
    public ThyroidHormones(double t3Level, double t4Level) {
        this.t3Level = t3Level;
        this.t4Level = t4Level;
    }

    // Getter for T3 level
    public double getT3Level() {
        return t3Level;
    }

    // Setter for T3 level
    public void setT3Level(double t3Level) {
        this.t3Level = t3Level;
    }

    // Getter for T4 level
    public double getT4Level() {
        return t4Level;
    }

    // Setter for T4 level
    public void setT4Level(double t4Level) {
        this.t4Level = t4Level;
    }
}