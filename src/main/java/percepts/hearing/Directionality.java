package percepts.hearing;

public class Directionality {
    // Properties
    private double interauralTimeDifference; // Represents the time difference between arrival of sound waves at each ear (in milliseconds)
    private double interauralLevelDifference; // Represents the level (intensity) difference of sound waves reaching each ear (in decibels)

    // Constructor
    public Directionality(double interauralTimeDifference, double interauralLevelDifference) {
        this.interauralTimeDifference = interauralTimeDifference;
        this.interauralLevelDifference = interauralLevelDifference;
    }

    // Getter and Setter methods
    public double getInterauralTimeDifference() {
        return interauralTimeDifference;
    }

    public void setInterauralTimeDifference(double interauralTimeDifference) {
        this.interauralTimeDifference = interauralTimeDifference;
    }

    public double getInterauralLevelDifference() {
        return interauralLevelDifference;
    }

    public void setInterauralLevelDifference(double interauralLevelDifference) {
        this.interauralLevelDifference = interauralLevelDifference;
    }

    // Method to modify the interaural time difference
    public void modifyInterauralTimeDifference(double newInterauralTimeDifference) {
        this.interauralTimeDifference = newInterauralTimeDifference;
    }

    // Method to modify the interaural level difference
    public void modifyInterauralLevelDifference(double newInterauralLevelDifference) {
        this.interauralLevelDifference = newInterauralLevelDifference;
    }
}