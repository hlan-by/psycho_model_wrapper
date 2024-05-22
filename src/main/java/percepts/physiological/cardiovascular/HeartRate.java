package percepts.physiological.cardiovascular;

public class HeartRate {
    // Parameter for heart rate (beats per minute)
    private int beatsPerMinute;

    // Constructor
    public HeartRate(int beatsPerMinute) {
        this.beatsPerMinute = beatsPerMinute;
    }

    // Getter for heart rate
    public int getBeatsPerMinute() {
        return beatsPerMinute;
    }

    // Setter for heart rate
    public void setBeatsPerMinute(int beatsPerMinute) {
        this.beatsPerMinute = beatsPerMinute;
    }

}

