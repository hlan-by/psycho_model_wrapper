package percepts.vision;

public class Context {
    // Properties
    private String lightingConditions; // Represents the lighting conditions in the environment
    private String backgroundScenery;  // Represents the background scenery
    private String priorKnowledge;     // Represents prior knowledge or expectations

    // Constructor
    public Context(String lightingConditions, String backgroundScenery, String priorKnowledge) {
        this.lightingConditions = lightingConditions;
        this.backgroundScenery = backgroundScenery;
        this.priorKnowledge = priorKnowledge;
    }

    // Getter and Setter methods
    public String getLightingConditions() {
        return lightingConditions;
    }

    public void setLightingConditions(String lightingConditions) {
        this.lightingConditions = lightingConditions;
    }

    public String getBackgroundScenery() {
        return backgroundScenery;
    }

    public void setBackgroundScenery(String backgroundScenery) {
        this.backgroundScenery = backgroundScenery;
    }

    public String getPriorKnowledge() {
        return priorKnowledge;
    }

    public void setPriorKnowledge(String priorKnowledge) {
        this.priorKnowledge = priorKnowledge;
    }

    // Method to change the lighting conditions
    public void changeLightingConditions(String newLightingConditions) {
        this.lightingConditions = newLightingConditions;
    }

    // Method to change the background scenery
    public void changeBackgroundScenery(String newBackgroundScenery) {
        this.backgroundScenery = newBackgroundScenery;
    }

    // Method to update the prior knowledge or expectations
    public void updatePriorKnowledge(String newPriorKnowledge) {
        this.priorKnowledge = newPriorKnowledge;
    }
}

