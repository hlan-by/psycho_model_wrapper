package percepts;

import java.util.HashMap;
import java.util.Map;

// CombinedPercept can contain both simple percepts and other CombinedPercepts
public class CombinedPercept implements Percept {
    private Map<String, Percept> percepts;
    private double signalLevel;

    public CombinedPercept() {
        this.percepts = new HashMap<>();
        this.signalLevel = 0.0; // Default signal level
    }

    public void addPercept(String key, Percept percept) {
        percepts.put(key, percept);
        updateSignalLevel();
    }

    public Percept getPercept(String key) {
        return percepts.get(key);
    }

    private void updateSignalLevel() {
        // Calculate the average signal level of all contained percepts
        this.signalLevel = percepts.values().stream()
                .mapToDouble(Percept::getSignalLevel)
                .average()
                .orElse(0.0);
    }

    @Override
    public double getSignalLevel() {
        return signalLevel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", signalLevel=").append(signalLevel)
                .append(", percepts={\n");
        for (Map.Entry<String, Percept> entry : percepts.entrySet()) {
            sb.append("  ").append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        sb.append("}}");
        return sb.toString();
    }
}
