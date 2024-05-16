package percepts.taste;

public class IndividualVariation {
    // Properties
    private String geneticDifferences; // Represents genetic differences influencing taste perception
    private int age;                   // Represents the age of the individual
    private String gender;             // Represents the gender of the individual
    private String culturalBackground;// Represents the cultural background of the individual
    private String priorExperiences;  // Represents prior experiences with certain foods

    // Constructor
    public IndividualVariation(String geneticDifferences, int age, String gender, String culturalBackground, String priorExperiences) {
        this.geneticDifferences = geneticDifferences;
        this.age = age;
        this.gender = gender;
        this.culturalBackground = culturalBackground;
        this.priorExperiences = priorExperiences;
    }

    // Getter and Setter methods
    public String getGeneticDifferences() {
        return geneticDifferences;
    }

    public void setGeneticDifferences(String geneticDifferences) {
        this.geneticDifferences = geneticDifferences;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCulturalBackground() {
        return culturalBackground;
    }

    public void setCulturalBackground(String culturalBackground) {
        this.culturalBackground = culturalBackground;
    }

    public String getPriorExperiences() {
        return priorExperiences;
    }

    public void setPriorExperiences(String priorExperiences) {
        this.priorExperiences = priorExperiences;
    }

    // Method to update prior experiences
    public void updatePriorExperiences(String newPriorExperiences) {
        this.priorExperiences = newPriorExperiences;
    }
}