package percepts.physiological.hormonal;

public class Insulin {
    // Parameter for insulin level (µU/mL)
    private double insulinLevel;

    // Constructor
    public Insulin(double insulinLevel) {
        this.insulinLevel = insulinLevel;
    }

    // Getter for insulin level
    public double getInsulinLevel() {
        return insulinLevel;
    }

    // Setter for insulin level
    public void setInsulinLevel(double insulinLevel) {
        this.insulinLevel = insulinLevel;
    }
}