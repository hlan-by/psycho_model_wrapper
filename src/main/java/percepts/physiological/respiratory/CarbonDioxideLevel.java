package percepts.physiological.respiratory;

public class CarbonDioxideLevel {
    // Parameter for end-tidal CO2 (mmHg)
    private double endTidalCO2;

    // Constructor
    public CarbonDioxideLevel(double endTidalCO2) {
        this.endTidalCO2 = endTidalCO2;
    }

    // Getter for end-tidal CO2
    public double getEndTidalCO2() {
        return endTidalCO2;
    }

    // Setter for end-tidal CO2
    public void setEndTidalCO2(double endTidalCO2) {
        this.endTidalCO2 = endTidalCO2;
    }
}