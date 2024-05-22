package percepts.physiological.electrolyte_mineral;

public class Chloride {
    // Parameter for chloride level (mmol/L)
    private double chlorideLevel;

    // Constructor
    public Chloride(double chlorideLevel) {
        this.chlorideLevel = chlorideLevel;
    }

    // Getter for chloride level
    public double getChlorideLevel() {
        return chlorideLevel;
    }

    // Setter for chloride level
    public void setChlorideLevel(double chlorideLevel) {
        this.chlorideLevel = chlorideLevel;
    }
}