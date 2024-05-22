package percepts.physiological.body_fluids_electrolytes_balance;

public class SweatComposition {
    // Parameters for sweat composition
    private double sodiumLevel;
    private double potassiumLevel;
    private double chlorideLevel;

    // Constructor
    public SweatComposition(double sodiumLevel, double potassiumLevel, double chlorideLevel) {
        this.sodiumLevel = sodiumLevel;
        this.potassiumLevel = potassiumLevel;
        this.chlorideLevel = chlorideLevel;
    }

    // Getter and setter methods for sodium level
    public double getSodiumLevel() {
        return sodiumLevel;
    }

    public void setSodiumLevel(double sodiumLevel) {
        this.sodiumLevel = sodiumLevel;
    }

    // Getter and setter methods for potassium level
    public double getPotassiumLevel() {
        return potassiumLevel;
    }

    public void setPotassiumLevel(double potassiumLevel) {
        this.potassiumLevel = potassiumLevel;
    }

    // Getter and setter methods for chloride level
    public double getChlorideLevel() {
        return chlorideLevel;
    }

    public void setChlorideLevel(double chlorideLevel) {
        this.chlorideLevel = chlorideLevel;
    }
}

