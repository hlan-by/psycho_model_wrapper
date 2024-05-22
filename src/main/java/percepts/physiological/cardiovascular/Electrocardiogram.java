package percepts.physiological.cardiovascular;

public class Electrocardiogram {
    // Parameter for ECG data (simple representation as a string)
    private String ecgData;

    // Constructor
    public Electrocardiogram(String ecgData) {
        this.ecgData = ecgData;
    }

    // Getter for ECG data
    public String getEcgData() {
        return ecgData;
    }

    // Setter for ECG data
    public void setEcgData(String ecgData) {
        this.ecgData = ecgData;
    }

}

