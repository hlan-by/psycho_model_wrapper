package percepts.physiological.hormonal;

public class AdrenalineAndNoradrenaline {
    // Parameters for adrenaline and noradrenaline levels (pg/mL)
    private double adrenalineLevel;
    private double noradrenalineLevel;

    // Constructor
    public AdrenalineAndNoradrenaline(double adrenalineLevel, double noradrenalineLevel) {
        this.adrenalineLevel = adrenalineLevel;
        this.noradrenalineLevel = noradrenalineLevel;
    }

    // Getter for adrenaline level
    public double getAdrenalineLevel() {
        return adrenalineLevel;
    }

    // Setter for adrenaline level
    public void setAdrenalineLevel(double adrenalineLevel) {
        this.adrenalineLevel = adrenalineLevel;
    }

    // Getter for noradrenaline level
    public double getNoradrenalineLevel() {
        return noradrenalineLevel;
    }

    // Setter for noradrenaline level
    public void setNoradrenalineLevel(double noradrenalineLevel) {
        this.noradrenalineLevel = noradrenalineLevel;
    }
}