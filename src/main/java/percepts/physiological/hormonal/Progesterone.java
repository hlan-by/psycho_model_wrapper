package percepts.physiological.hormonal;

public class Progesterone {
    // Parameter for progesterone level (ng/mL)
    private double progesteroneLevel;

    // Constructor
    public Progesterone(double progesteroneLevel) {
        this.progesteroneLevel = progesteroneLevel;
    }

    // Getter for progesterone level
    public double getProgesteroneLevel() {
        return progesteroneLevel;
    }

    // Setter for progesterone level
    public void setProgesteroneLevel(double progesteroneLevel) {
        this.progesteroneLevel = progesteroneLevel;
    }
}