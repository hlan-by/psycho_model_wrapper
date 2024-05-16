package percepts.vision;

public class LightColor {
    // Properties
    private int brightness; // Represents the brightness of the light
    private String color;   // Represents the color of the light
    private int contrast;   // Represents the contrast of the light

    // Constructor
    public LightColor(int brightness, String color, int contrast) {
        this.brightness = brightness;
        this.color = color;
        this.contrast = contrast;
    }

    // Getter and Setter methods
    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getContrast() {
        return contrast;
    }

    public void setContrast(int contrast) {
        this.contrast = contrast;
    }


    // Method to change the brightness of the light
    public void adjustBrightness(int newBrightness) {
        this.brightness = newBrightness;
    }

    // Method to change the color of the light
    public void changeColor(String newColor) {
        this.color = newColor;
    }

    // Method to change the contrast of the light
    public void adjustContrast(int newContrast) {
        this.contrast = newContrast;
    }
}