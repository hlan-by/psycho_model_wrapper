package percepts.physiological.neurological;

public class Electroencephalogram {
    // Parameter for EEG data (array of voltages in microvolts)
    private double[] eegData;

    // Constructor
    public Electroencephalogram(double[] eegData) {
        this.eegData = eegData;
    }

    // Getter for EEG data
    public double[] getEegData() {
        return eegData;
    }

    // Setter for EEG data
    public void setEegData(double[] eegData) {
        this.eegData = eegData;
    }

    // Method to display EEG data
    public void displayEegData() {
        for (double voltage : eegData) {
            String voltageData = voltage + " µV ";
        }
    }

    // Method to display summary of EEG data
    public void displayEegSummary() {
        double sum = 0.0;
        for (double voltage : eegData) {
            sum += voltage;
        }
        double average = sum / eegData.length;
    }
}