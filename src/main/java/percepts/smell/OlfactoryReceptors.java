package percepts.smell;

public class OlfactoryReceptors {
    // Properties
    private String location; // Represents the location of olfactory receptors (e.g., olfactory epithelium)
    private String specificity; // Represents the specificity of olfactory receptors to certain odorant molecules

    // Constructor
    public OlfactoryReceptors(String location, String specificity) {
        this.location = location;
        this.specificity = specificity;
    }

    // Getter and Setter methods
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSpecificity() {
        return specificity;
    }

    public void setSpecificity(String specificity) {
        this.specificity = specificity;
    }

    // Method to modify the specificity of olfactory receptors
    public void modifySpecificity(String newSpecificity) {
        this.specificity = newSpecificity;
    }
}

