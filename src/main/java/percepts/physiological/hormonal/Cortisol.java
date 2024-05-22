package percepts.physiological.hormonal;

public class Cortisol {
    // Parameter for cortisol level (µg/dL)
    private double cortisolLevel;

    // Constructor
    public Cortisol(double cortisolLevel) {
        this.cortisolLevel = cortisolLevel;
    }

    // Getter for cortisol level
    public double getCortisolLevel() {
        return cortisolLevel;
    }

    // Setter for cortisol level
    public void setCortisolLevel(double cortisolLevel) {
        this.cortisolLevel = cortisolLevel;
    }
}