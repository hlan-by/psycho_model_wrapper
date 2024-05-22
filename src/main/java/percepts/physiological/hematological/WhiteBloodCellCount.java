package percepts.physiological.hematological;

public class WhiteBloodCellCount {
    // Parameter for WBC count (cells per microliter)
    private double wbcCount;

    // Constructor
    public WhiteBloodCellCount(double wbcCount) {
        this.wbcCount = wbcCount;
    }

    // Getter for WBC count
    public double getWbcCount() {
        return wbcCount;
    }

    // Setter for WBC count
    public void setWbcCount(double wbcCount) {
        this.wbcCount = wbcCount;
    }
}