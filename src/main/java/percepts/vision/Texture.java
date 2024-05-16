package percepts.vision;

public class Texture {
    // Properties
    private String surfaceType; // Represents the type of surface texture (e.g., smooth, rough, patterned)
    private String description; // Represents a description of the texture

    // Constructor
    public Texture(String surfaceType, String description) {
        this.surfaceType = surfaceType;
        this.description = description;
    }

    // Getter and Setter methods
    public String getSurfaceType() {
        return surfaceType;
    }

    public void setSurfaceType(String surfaceType) {
        this.surfaceType = surfaceType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Method to change the surface type of the texture
    public void changeSurfaceType(String newSurfaceType) {
        this.surfaceType = newSurfaceType;
    }

    // Method to change the description of the texture
    public void changeDescription(String newDescription) {
        this.description = newDescription;
    }
}