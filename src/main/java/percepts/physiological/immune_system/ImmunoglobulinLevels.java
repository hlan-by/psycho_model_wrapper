package percepts.physiological.immune_system;

public class ImmunoglobulinLevels {
    // Parameters for immunoglobulin levels
    private double igALevel;
    private double igGLevel;
    private double igMLevel;
    private double igDLevel;
    private double igELevel;

    // Constructor
    public ImmunoglobulinLevels(double igALevel, double igGLevel, double igMLevel, double igDLevel, double igELevel) {
        this.igALevel = igALevel;
        this.igGLevel = igGLevel;
        this.igMLevel = igMLevel;
        this.igDLevel = igDLevel;
        this.igELevel = igELevel;
    }

    // Getter for IgA level
    public double getIgALevel() {
        return igALevel;
    }

    // Setter for IgA level
    public void setIgALevel(double igALevel) {
        this.igALevel = igALevel;
    }

    // Getter for IgG level
    public double getIgGLevel() {
        return igGLevel;
    }

    // Setter for IgG level
    public void setIgGLevel(double igGLevel) {
        this.igGLevel = igGLevel;
    }

    // Getter for IgM level
    public double getIgMLevel() {
        return igMLevel;
    }

    // Setter for IgM level
    public void setIgMLevel(double igMLevel) {
        this.igMLevel = igMLevel;
    }

    // Getter for IgD level
    public double getIgDLevel() {
        return igDLevel;
    }

    // Setter for IgD level
    public void setIgDLevel(double igDLevel) {
        this.igDLevel = igDLevel;
    }

    // Getter for IgE level
    public double getIgELevel() {
        return igELevel;
    }

    // Setter for IgE level
    public void setIgELevel(double igELevel) {
        this.igELevel = igELevel;
    }
}