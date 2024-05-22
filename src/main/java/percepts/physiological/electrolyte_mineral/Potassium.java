package percepts.physiological.electrolyte_mineral;

public class Potassium {
    // Parameter for potassium level (mmol/L)
    private double potassiumLevel;

    // Constructor
    public Potassium(double potassiumLevel) {
        this.potassiumLevel = potassiumLevel;
    }

    // Getter for potassium level
    public double getPotassiumLevel() {
        return potassiumLevel;
    }

    // Setter for potassium level
    public void setPotassiumLevel(double potassiumLevel) {
        this.potassiumLevel = potassiumLevel;
    }
}

