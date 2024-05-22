package percepts.physiological.temperature_regulation;

public class TemperatureRegulation {
    // Parameters for temperature regulation
    private double coreBodyTemperature;
    private double skinTemperature;

    // Constructor
    public TemperatureRegulation(double coreBodyTemperature, double skinTemperature) {
        this.coreBodyTemperature = coreBodyTemperature;
        this.skinTemperature = skinTemperature;
    }

    // Getter and setter methods for core body temperature
    public double getCoreBodyTemperature() {
        return coreBodyTemperature;
    }

    public void setCoreBodyTemperature(double coreBodyTemperature) {
        this.coreBodyTemperature = coreBodyTemperature;
    }

    // Getter and setter methods for skin temperature
    public double getSkinTemperature() {
        return skinTemperature;
    }

    public void setSkinTemperature(double skinTemperature) {
        this.skinTemperature = skinTemperature;
    }
}

