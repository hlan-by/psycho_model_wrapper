package percepts.physiological.respiratory;

public class LungVolumeCapacity {
    // Parameters for lung volume and capacity (liters)
    private double tidalVolume;      // Volume of air displaced between normal inhalation and exhalation
    private double vitalCapacity;    // Maximum amount of air exhaled after maximum inhalation

    // Constructor
    public LungVolumeCapacity(double tidalVolume, double vitalCapacity) {
        this.tidalVolume = tidalVolume;
        this.vitalCapacity = vitalCapacity;
    }

    // Getters for lung volume and capacity
    public double getTidalVolume() {
        return tidalVolume;
    }

    public double getVitalCapacity() {
        return vitalCapacity;
    }

    // Setters for lung volume and capacity
    public void setTidalVolume(double tidalVolume) {
        this.tidalVolume = tidalVolume;
    }

    public void setVitalCapacity(double vitalCapacity) {
        this.vitalCapacity = vitalCapacity;
    }
}