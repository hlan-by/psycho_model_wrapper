package percepts.smell;

public class Odorants {
    // Properties
    private String chemicalCompound; // Represents the chemical compound of the odorant
    private double concentration;    // Represents the concentration of the odorant (in parts per million, ppm)

    // Constructor
    public Odorants(String chemicalCompound, double concentration) {
        this.chemicalCompound = chemicalCompound;
        this.concentration = concentration;
    }

    // Getter and Setter methods
    public String getChemicalCompound() {
        return chemicalCompound;
    }

    public void setChemicalCompound(String chemicalCompound) {
        this.chemicalCompound = chemicalCompound;
    }

    public double getConcentration() {
        return concentration;
    }

    public void setConcentration(double concentration) {
        this.concentration = concentration;
    }

    // Method to modify the concentration of the odorant
    public void modifyConcentration(double newConcentration) {
        this.concentration = newConcentration;
    }
}
