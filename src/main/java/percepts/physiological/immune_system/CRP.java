package percepts.physiological.immune_system;

public class CRP {
    // Parameter for  C-reactive Protein level
    private double crpLevel;

    // Constructor
    public CRP(double crpLevel) {
        this.crpLevel = crpLevel;
    }

    // Getter for CRP level
    public double getCRPLevel() {
        return crpLevel;
    }

    // Setter for CRP level
    public void setCRPLevel(double crpLevel) {
        this.crpLevel = crpLevel;
    }
}