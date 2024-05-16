package percepts.touch;

public class Proprioception {
    // Properties
    private String bodyPart;  // Represents the body part associated with proprioception
    private String position;  // Represents the perceived position of the body part
    private String movement;  // Represents the perceived movement of the body part

    // Constructor
    public Proprioception(String bodyPart, String position, String movement) {
        this.bodyPart = bodyPart;
        this.position = position;
        this.movement = movement;
    }

    // Getter and Setter methods
    public String getBodyPart() {
        return bodyPart;
    }

    public void setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMovement() {
        return movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    // Method to update the perceived position of the body part
    public void updatePosition(String newPosition) {
        this.position = newPosition;
    }

    // Method to update the perceived movement of the body part
    public void updateMovement(String newMovement) {
        this.movement = newMovement;
    }
}