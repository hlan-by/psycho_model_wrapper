package percepts.taste;

public class Tastants {
    // Properties
    private String chemicalCompound; // Represents the chemical compound of the tastant
    private String source;           // Represents the source of the tastant (e.g., food, beverage)

    // Constructor
    public Tastants(String chemicalCompound, String source) {
        this.chemicalCompound = chemicalCompound;
        this.source = source;
    }

    // Getter and Setter methods
    public String getChemicalCompound() {
        return chemicalCompound;
    }

    public void setChemicalCompound(String chemicalCompound) {
        this.chemicalCompound = chemicalCompound;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    // Method to modify the chemical compound of the tastant
    public void modifyChemicalCompound(String newChemicalCompound) {
        this.chemicalCompound = newChemicalCompound;
    }

    // Method to modify the source of the tastant
    public void modifySource(String newSource) {
        this.source = newSource;
    }
}