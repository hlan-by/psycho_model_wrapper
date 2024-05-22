package percepts.physiological.hematological;

public class Hematocrit {
    // Parameter for hematocrit level (percentage)
    private double hematocritLevel;

    // Constructor
    public Hematocrit(double hematocritLevel) {
        this.hematocritLevel = hematocritLevel;
    }

    // Getter for hematocrit level
    public double getHematocritLevel() {
        return hematocritLevel;
    }

    // Setter for hematocrit level
    public void setHematocritLevel(double hematocritLevel) {
        this.hematocritLevel = hematocritLevel;
    }
}