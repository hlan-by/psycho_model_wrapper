package percepts.hearing;

public class SoundWaves {
    // Properties
    private double frequency; // Represents the frequency of the sound wave
    private double amplitude; // Represents the amplitude of the sound wave
    private String waveform;  // Represents the waveform of the sound wave

    // Constructor
    public SoundWaves(double frequency, double amplitude, String waveform) {
        this.frequency = frequency;
        this.amplitude = amplitude;
        this.waveform = waveform;
    }

    // Getter and Setter methods
    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(double amplitude) {
        this.amplitude = amplitude;
    }

    public String getWaveform() {
        return waveform;
    }

    public void setWaveform(String waveform) {
        this.waveform = waveform;
    }

    // Method to modify the frequency of the sound wave
    public void modifyFrequency(double newFrequency) {
        this.frequency = newFrequency;
    }

    // Method to modify the amplitude of the sound wave
    public void modifyAmplitude(double newAmplitude) {
        this.amplitude = newAmplitude;
    }

    // Method to modify the waveform of the sound wave
    public void modifyWaveform(String newWaveform) {
        this.waveform = newWaveform;
    }
}