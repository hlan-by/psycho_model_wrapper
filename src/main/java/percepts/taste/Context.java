package percepts.taste;

public class Context {
    // Properties
    private String aroma;           // Represents the aroma of the food or beverage
    private String visualAppearance;// Represents the visual appearance of the food or beverage
    private String socialSetting;   // Represents the social setting in which the food or beverage is consumed

    // Constructor
    public Context(String aroma, String visualAppearance, String socialSetting) {
        this.aroma = aroma;
        this.visualAppearance = visualAppearance;
        this.socialSetting = socialSetting;
    }

    // Getter and Setter methods
    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public String getVisualAppearance() {
        return visualAppearance;
    }

    public void setVisualAppearance(String visualAppearance) {
        this.visualAppearance = visualAppearance;
    }

    public String getSocialSetting() {
        return socialSetting;
    }

    public void setSocialSetting(String socialSetting) {
        this.socialSetting = socialSetting;
    }

    // Method to modify the aroma
    public void modifyAroma(String newAroma) {
        this.aroma = newAroma;
    }

    // Method to modify the visual appearance
    public void modifyVisualAppearance(String newVisualAppearance) {
        this.visualAppearance = newVisualAppearance;
    }

    // Method to modify the social setting
    public void modifySocialSetting(String newSocialSetting) {
        this.socialSetting = newSocialSetting;
    }
}