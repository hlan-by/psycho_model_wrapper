package percepts.physiological.hormonal;

public class Testosterone {
    // Parameter for testosterone level (ng/dL)
    private double testosteroneLevel;

    // Constructor
    public Testosterone(double testosteroneLevel) {
        this.testosteroneLevel = testosteroneLevel;
    }

    // Getter for testosterone level
    public double getTestosteroneLevel() {
        return testosteroneLevel;
    }

    // Setter for testosterone level
    public void setTestosteroneLevel(double testosteroneLevel) {
        this.testosteroneLevel = testosteroneLevel;
    }
}