package percepts.physiological.pain_sensory;

public class PainAndSensoryPerception {
    // Parameters for pain and sensory perception
    private int painLevel;
    private double sensoryThreshold;

    // Constructor
    public PainAndSensoryPerception(int painLevel, double sensoryThreshold) {
        this.painLevel = painLevel;
        this.sensoryThreshold = sensoryThreshold;
    }

    // Getter and setter methods for pain level
    public int getPainLevel() {
        return painLevel;
    }

    public void setPainLevel(int painLevel) {
        this.painLevel = painLevel;
    }

    // Getter and setter methods for sensory threshold
    public double getSensoryThreshold() {
        return sensoryThreshold;
    }

    public void setSensoryThreshold(double sensoryThreshold) {
        this.sensoryThreshold = sensoryThreshold;
    }
}