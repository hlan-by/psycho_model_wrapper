package percepts.physiological.respiratory;

public class OxygenSaturation {
    // Parameter for oxygen saturation (percentage)
    private double spO2;

    // Constructor
    public OxygenSaturation(double spO2) {
        this.spO2 = spO2;
    }

    // Getter for oxygen saturation
    public double getSpO2() {
        return spO2;
    }

    // Setter for oxygen saturation
    public void setSpO2(double spO2) {
        this.spO2 = spO2;
    }
}

