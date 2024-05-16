package percepts.touch;

public class ThermalStimuli {
    // Enum to represent different types of thermal receptors
    public enum ThermalReceptorType {
        COLD_RECEPTORS,
        WARMTH_RECEPTORS
    }

    // Properties
    private ThermalReceptorType receptorType; // Represents the type of thermal receptor
    private double temperatureChange;         // Represents the change in temperature

    // Constructor
    public ThermalStimuli(ThermalReceptorType receptorType, double temperatureChange) {
        this.receptorType = receptorType;
        this.temperatureChange = temperatureChange;
    }

    // Getter and Setter methods
    public ThermalReceptorType getReceptorType() {
        return receptorType;
    }

    public void setReceptorType(ThermalReceptorType receptorType) {
        this.receptorType = receptorType;
    }

    public double getTemperatureChange() {
        return temperatureChange;
    }

    public void setTemperatureChange(double temperatureChange) {
        this.temperatureChange = temperatureChange;
    }

    // Method to modify the temperature change
    public void modifyTemperatureChange(double newTemperatureChange) {
        this.temperatureChange = newTemperatureChange;
    }
}