package percepts.physiological.hormonal;

public class Estrogen {
    // Parameter for estrogen level (pg/mL)
    private double estrogenLevel;

    // Constructor
    public Estrogen(double estrogenLevel) {
        this.estrogenLevel = estrogenLevel;
    }

    // Getter for estrogen level
    public double getEstrogenLevel() {
        return estrogenLevel;
    }

    // Setter for estrogen level
    public void setEstrogenLevel(double estrogenLevel) {
        this.estrogenLevel = estrogenLevel;
    }
}