package percepts.physiological.cardiovascular;

public class BloodPressure {
    // Parameters for blood pressure (systolic and diastolic)
    private int systolicPressure;
    private int diastolicPressure;

    // Constructor
    public BloodPressure(int systolicPressure, int diastolicPressure) {
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
    }

    // Getters for blood pressure
    public int getSystolicPressure() {
        return systolicPressure;
    }

    public int getDiastolicPressure() {
        return diastolicPressure;
    }

    // Setters for blood pressure
    public void setSystolicPressure(int systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public void setDiastolicPressure(int diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }
}

