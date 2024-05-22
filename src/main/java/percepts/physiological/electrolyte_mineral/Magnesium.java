package percepts.physiological.electrolyte_mineral;

public class Magnesium {
    // Parameter for magnesium level (mmol/L)
    private double magnesiumLevel;

    // Constructor
    public Magnesium(double magnesiumLevel) {
        this.magnesiumLevel = magnesiumLevel;
    }

    // Getter for magnesium level
    public double getMagnesiumLevel() {
        return magnesiumLevel;
    }

    // Setter for magnesium level
    public void setMagnesiumLevel(double magnesiumLevel) {
        this.magnesiumLevel = magnesiumLevel;
    }
}

