package percepts.hearing;

public class Context {
    // Properties
    private double backgroundNoise; // Represents the level of background noise (in decibels)
    private double reverberation;   // Represents the level of reverberation (in seconds)
    private String priorExperiences; // Represents prior auditory experiences

    // Constructor
    public Context(double backgroundNoise, double reverberation, String priorExperiences) {
        this.backgroundNoise = backgroundNoise;
        this.reverberation = reverberation;
        this.priorExperiences = priorExperiences;
    }

    // Getter and Setter methods
    public double getBackgroundNoise() {
        return backgroundNoise;
    }

    public void setBackgroundNoise(double backgroundNoise) {
        this.backgroundNoise = backgroundNoise;
    }

    public double getReverberation() {
        return reverberation;
    }

    public void setReverberation(double reverberation) {
        this.reverberation = reverberation;
    }

    public String getPriorExperiences() {
        return priorExperiences;
    }

    public void setPriorExperiences(String priorExperiences) {
        this.priorExperiences = priorExperiences;
    }

    // Method to modify the background noise level
    public void modifyBackgroundNoise(double newBackgroundNoise) {
        this.backgroundNoise = newBackgroundNoise;
    }

    // Method to modify the reverberation level
    public void modifyReverberation(double newReverberation) {
        this.reverberation = newReverberation;
    }

    // Method to update prior auditory experiences
    public void updatePriorExperiences(String newPriorExperiences) {
        this.priorExperiences = newPriorExperiences;
    }
}