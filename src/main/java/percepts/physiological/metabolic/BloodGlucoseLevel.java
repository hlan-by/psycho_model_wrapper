package percepts.physiological.metabolic;

public class BloodGlucoseLevel {
    // Parameter for blood glucose concentration
    private double glucoseConcentration;

    // Constructor
    public BloodGlucoseLevel(double glucoseConcentration) {
        this.glucoseConcentration = glucoseConcentration;
    }

    // Getter for glucose concentration
    public double getGlucoseConcentration() {
        return glucoseConcentration;
    }

    // Setter for glucose concentration
    public void setGlucoseConcentration(double glucoseConcentration) {
        this.glucoseConcentration = glucoseConcentration;
    }

    // Method to display blood glucose level
    public void displayGlucoseLevel() {
    }
}

