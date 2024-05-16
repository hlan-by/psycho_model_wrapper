package percepts.touch;

// PainPerception.java
public class PainPerception {
    // Properties
    private String location; // Represents the location of pain perception
    private String intensity; // Represents the intensity of pain perception

    // Constructor
    public PainPerception(String location, String intensity) {
        this.location = location;
        this.intensity = intensity;
    }

    // Getter and Setter methods
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getIntensity() {
        return intensity;
    }

    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }

    // Method to modify the location of pain perception
    public void modifyLocation(String newLocation) {
        this.location = newLocation;
    }

    // Method to modify the intensity of pain perception
    public void modifyIntensity(String newIntensity) {
        this.intensity = newIntensity;
    }
}