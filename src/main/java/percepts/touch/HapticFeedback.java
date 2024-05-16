package percepts.touch;

public class HapticFeedback {
    // Properties
    private String interactionType;  // Represents the type of interaction (e.g., object manipulation, surface exploration)
    private String tactileInformation;  // Represents the tactile information provided by haptic feedback

    // Constructor
    public HapticFeedback(String interactionType, String tactileInformation) {
        this.interactionType = interactionType;
        this.tactileInformation = tactileInformation;
    }

    // Getter and Setter methods
    public String getInteractionType() {
        return interactionType;
    }

    public void setInteractionType(String interactionType) {
        this.interactionType = interactionType;
    }

    public String getTactileInformation() {
        return tactileInformation;
    }

    public void setTactileInformation(String tactileInformation) {
        this.tactileInformation = tactileInformation;
    }

    // Method to update the tactile information provided by haptic feedback
    public void updateTactileInformation(String newTactileInformation) {
        this.tactileInformation = newTactileInformation;
    }
}