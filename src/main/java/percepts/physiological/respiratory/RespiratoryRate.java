package percepts.physiological.respiratory;

public class RespiratoryRate {
    // Parameter for respiratory rate (breaths per minute)
    private int breathsPerMinute;

    // Constructor
    public RespiratoryRate(int breathsPerMinute) {
        this.breathsPerMinute = breathsPerMinute;
    }

    // Getter for respiratory rate
    public int getBreathsPerMinute() {
        return breathsPerMinute;
    }

    // Setter for respiratory rate
    public void setBreathsPerMinute(int breathsPerMinute) {
        this.breathsPerMinute = breathsPerMinute;
    }
}

