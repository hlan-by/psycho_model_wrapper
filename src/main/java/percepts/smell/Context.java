package percepts.smell;

public class Context {
    // Properties
    private String environment; // Represents the environment in which the smell is encountered
    private double temperature; // Represents the temperature of the environment (in Celsius)
    private double humidity;    // Represents the humidity of the environment (in percentage)

    // Constructor
    public Context(String environment, double temperature, double humidity) {
        this.environment = environment;
        this.temperature = temperature;
        this.humidity = humidity;
    }

    // Getter and Setter methods
    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    // Method to modify the environment
    public void modifyEnvironment(String newEnvironment) {
        this.environment = newEnvironment;
    }

    // Method to modify the temperature
    public void modifyTemperature(double newTemperature) {
        this.temperature = newTemperature;
    }

    // Method to modify the humidity
    public void modifyHumidity(double newHumidity) {
        this.humidity = newHumidity;
    }
}
