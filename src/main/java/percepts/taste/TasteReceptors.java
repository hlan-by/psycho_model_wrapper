package percepts.taste;

public class TasteReceptors {
    // Properties
    private String location; // Represents the location of taste receptors (e.g., tongue, oral cavity)
    private int number;      // Represents the number of taste receptors

    // Constructor
    public TasteReceptors(String location, int number) {
        this.location = location;
        this.number = number;
    }

    // Getter and Setter methods
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // Method to modify the location of taste receptors
    public void modifyLocation(String newLocation) {
        this.location = newLocation;
    }

    // Method to modify the number of taste receptors
    public void modifyNumber(int newNumber) {
        this.number = newNumber;
    }
}