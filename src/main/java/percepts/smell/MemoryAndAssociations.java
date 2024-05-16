package percepts.smell;

public class MemoryAndAssociations {
    // Properties
    private String memory; // Represents the memory associated with a particular smell
    private String emotionalResponse; // Represents the emotional response triggered by a particular smell

    // Constructor
    public MemoryAndAssociations(String memory, String emotionalResponse) {
        this.memory = memory;
        this.emotionalResponse = emotionalResponse;
    }

    // Getter and Setter methods
    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getEmotionalResponse() {
        return emotionalResponse;
    }

    public void setEmotionalResponse(String emotionalResponse) {
        this.emotionalResponse = emotionalResponse;
    }

    // Method to modify the memory associated with a smell
    public void modifyMemory(String newMemory) {
        this.memory = newMemory;
    }

    // Method to modify the emotional response triggered by a smell
    public void modifyEmotionalResponse(String newEmotionalResponse) {
        this.emotionalResponse = newEmotionalResponse;
    }
}