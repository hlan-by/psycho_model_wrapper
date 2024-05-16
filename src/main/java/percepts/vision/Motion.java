package percepts.vision;

public class Motion {
    // Properties
    private double speed;     // Represents the speed of motion
    private double direction; // Represents the direction of motion (in degrees)

    // Constructor
    public Motion(double speed, double direction) {
        this.speed = speed;
        this.direction = direction;
    }

    // Getter and Setter methods
    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDirection() {
        return direction;
    }

    public void setDirection(double direction) {
        this.direction = direction;
    }

    // Method to change the speed of motion
    public void changeSpeed(double newSpeed) {
        this.speed = newSpeed;
    }

    // Method to change the direction of motion
    public void changeDirection(double newDirection) {
        this.direction = newDirection;
    }
}

