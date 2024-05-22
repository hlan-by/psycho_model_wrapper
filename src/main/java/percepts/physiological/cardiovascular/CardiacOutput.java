package percepts.physiological.cardiovascular;

public class CardiacOutput {
    // Parameter for cardiac output (liters per minute)
    private double volumePerMinute;

    // Constructor
    public CardiacOutput(double volumePerMinute) {
        this.volumePerMinute = volumePerMinute;
    }

    // Getter for cardiac output
    public double getVolumePerMinute() {
        return volumePerMinute;
    }

    // Setter for cardiac output
    public void setVolumePerMinute(double volumePerMinute) {
        this.volumePerMinute = volumePerMinute;
    }
}

