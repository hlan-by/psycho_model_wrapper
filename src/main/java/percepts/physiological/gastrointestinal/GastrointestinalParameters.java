package percepts.physiological.gastrointestinal;

public class GastrointestinalParameters {
    // Parameters for gastrointestinal parameters
    private double gastricPH;
    private String bowelSounds;

    // Constructor
    public GastrointestinalParameters(double gastricPH, String bowelSounds) {
        this.gastricPH = gastricPH;
        this.bowelSounds = bowelSounds;
    }

    // Getter and setter methods for gastric pH
    public double getGastricPH() {
        return gastricPH;
    }

    public void setGastricPH(double gastricPH) {
        this.gastricPH = gastricPH;
    }

    // Getter and setter methods for bowel sounds
    public String getBowelSounds() {
        return bowelSounds;
    }

    public void setBowelSounds(String bowelSounds) {
        this.bowelSounds = bowelSounds;
    }
}