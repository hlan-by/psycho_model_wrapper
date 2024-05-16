package percepts.vision;

public class Depth {
    // Properties
    private double distance; // Represents the distance of the object from the observer
    private String spatialRelationship; // Represents the spatial relationship of the object with other objects

    // Constructor
    public Depth(double distance, String spatialRelationship) {
        this.distance = distance;
        this.spatialRelationship = spatialRelationship;
    }

    // Getter and Setter methods
    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getSpatialRelationship() {
        return spatialRelationship;
    }

    public void setSpatialRelationship(String spatialRelationship) {
        this.spatialRelationship = spatialRelationship;
    }

    // Method to change the distance of the object
    public void changeDistance(double newDistance) {
        this.distance = newDistance;
    }

    // Method to change the spatial relationship of the object
    public void changeSpatialRelationship(String newSpatialRelationship) {
        this.spatialRelationship = newSpatialRelationship;
    }
}

