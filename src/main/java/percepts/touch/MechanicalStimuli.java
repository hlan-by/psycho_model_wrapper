package percepts.touch;

public class MechanicalStimuli {
    // Enum to represent different types of mechanoreceptors
    public enum MechanoreceptorType {
        MERKEL_CELLS,
        MEISSNERS_CORPUSCLES,
        PACINIAN_CORPUSCLES,
        RUFFINI_ENDINGS
    }

    // Properties
    private MechanoreceptorType receptorType; // Represents the type of mechanoreceptor
    private double intensity;                 // Represents the intensity of the mechanical stimulus

    // Constructor
    public MechanicalStimuli(MechanoreceptorType receptorType, double intensity) {
        this.receptorType = receptorType;
        this.intensity = intensity;
    }

    // Getter and Setter methods
    public MechanoreceptorType getReceptorType() {
        return receptorType;
    }

    public void setReceptorType(MechanoreceptorType receptorType) {
        this.receptorType = receptorType;
    }

    public double getIntensity() {
        return intensity;
    }

    public void setIntensity(double intensity) {
        this.intensity = intensity;
    }

    // Method to modify the intensity of the mechanical stimulus
    public void modifyIntensity(double newIntensity) {
        this.intensity = newIntensity;
    }
}