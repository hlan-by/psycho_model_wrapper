package percepts.smell;

public class OdorQuality {
    // Properties
    private String descriptor; // Represents the descriptor for odor quality (e.g., floral, fruity, spicy, musky, etc.)

    // Constructor
    public OdorQuality(String descriptor) {
        this.descriptor = descriptor;
    }

    // Getter and Setter methods
    public String getDescriptor() {
        return descriptor;
    }

    public void setDescriptor(String descriptor) {
        this.descriptor = descriptor;
    }

    // Method to modify the descriptor for odor quality
    public void modifyDescriptor(String newDescriptor) {
        this.descriptor = newDescriptor;
    }
}