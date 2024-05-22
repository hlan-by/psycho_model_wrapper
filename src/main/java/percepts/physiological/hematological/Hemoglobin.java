package percepts.physiological.hematological;

public class Hemoglobin {
    // Parameter for hemoglobin level (g/dL)
    private double hemoglobinLevel;

    // Constructor
    public Hemoglobin(double hemoglobinLevel) {
        this.hemoglobinLevel = hemoglobinLevel;
    }

    // Getter for hemoglobin level
    public double getHemoglobinLevel() {
        return hemoglobinLevel;
    }

    // Setter for hemoglobin level
    public void setHemoglobinLevel(double hemoglobinLevel) {
        this.hemoglobinLevel = hemoglobinLevel;
    }
}

