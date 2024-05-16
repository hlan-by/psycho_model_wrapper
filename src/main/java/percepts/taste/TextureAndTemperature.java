package percepts.taste;

public class TextureAndTemperature {
    // Properties
    private String texture;     // Represents the texture of the food or beverage (e.g., creamy, crunchy)
    private double temperature; // Represents the temperature of the food or beverage (in Celsius)

    // Constructor
    public TextureAndTemperature(String texture, double temperature) {
        this.texture = texture;
        this.temperature = temperature;
    }

    // Getter and Setter methods
    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    // Method to modify the texture
    public void modifyTexture(String newTexture) {
        this.texture = newTexture;
    }

    // Method to modify the temperature
    public void modifyTemperature(double newTemperature) {
        this.temperature = newTemperature;
    }
}