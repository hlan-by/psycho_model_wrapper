package percepts.physiological.hematological;

public class PlateletCount {
    // Parameter for platelet count (cells per microliter)
    private double plateletCount;

    // Constructor
    public PlateletCount(double plateletCount) {
        this.plateletCount = plateletCount;
    }

    // Getter for platelet count
    public double getPlateletCount() {
        return plateletCount;
    }

    // Setter for platelet count
    public void setPlateletCount(double plateletCount) {
        this.plateletCount = plateletCount;
    }
}