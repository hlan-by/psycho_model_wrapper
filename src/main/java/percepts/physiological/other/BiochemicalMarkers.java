package percepts.physiological.other;

public class BiochemicalMarkers {
    // Parameters for biochemical markers
    private double lactateLevels;
    private double bilirubinLevels;

    // Constructor
    public BiochemicalMarkers(double lactateLevels, double bilirubinLevels) {
        this.lactateLevels = lactateLevels;
        this.bilirubinLevels = bilirubinLevels;
    }

    // Getter and setter methods for lactate levels
    public double getLactateLevels() {
        return lactateLevels;
    }

    public void setLactateLevels(double lactateLevels) {
        this.lactateLevels = lactateLevels;
    }

    // Getter and setter methods for bilirubin levels
    public double getBilirubinLevels() {
        return bilirubinLevels;
    }

    public void setBilirubinLevels(double bilirubinLevels) {
        this.bilirubinLevels = bilirubinLevels;
    }
}