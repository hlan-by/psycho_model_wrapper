package percepts.hearing;

public class Timbre {
    // Properties
    private String waveformShape; // Represents the shape of the waveform
    private String harmonics;     // Represents the harmonics of the sound
    private String overtones;     // Represents the overtones of the sound

    // Constructor
    public Timbre(String waveformShape, String harmonics, String overtones) {
        this.waveformShape = waveformShape;
        this.harmonics = harmonics;
        this.overtones = overtones;
    }

    // Getter and Setter methods
    public String getWaveformShape() {
        return waveformShape;
    }

    public void setWaveformShape(String waveformShape) {
        this.waveformShape = waveformShape;
    }

    public String getHarmonics() {
        return harmonics;
    }

    public void setHarmonics(String harmonics) {
        this.harmonics = harmonics;
    }

    public String getOvertones() {
        return overtones;
    }

    public void setOvertones(String overtones) {
        this.overtones = overtones;
    }

    // Method to modify the waveform shape
    public void modifyWaveformShape(String newWaveformShape) {
        this.waveformShape = newWaveformShape;
    }

    // Method to modify the harmonics
    public void modifyHarmonics(String newHarmonics) {
        this.harmonics = newHarmonics;
    }

    // Method to modify the overtones
    public void modifyOvertones(String newOvertones) {
        this.overtones = newOvertones;
    }
}