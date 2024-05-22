package percepts.physiological.neurological;

public class IntracranialPressure {
    // Parameter for ICP level (mmHg)
    private double icpLevel;

    // Constructor
    public IntracranialPressure(double icpLevel) {
        this.icpLevel = icpLevel;
    }

    // Getter for ICP level
    public double getIcpLevel() {
        return icpLevel;
    }

    // Setter for ICP level
    public void setIcpLevel(double icpLevel) {
        this.icpLevel = icpLevel;
    }

    // Method to check if ICP is within normal range
    public boolean isNormalIcp() {
        return icpLevel >= 7 && icpLevel <= 15;
    }

}
