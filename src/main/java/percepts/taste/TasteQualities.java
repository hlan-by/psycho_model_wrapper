package percepts.taste;

public class TasteQualities {
    // Enum to represent the primary taste qualities
    public enum TasteQuality {
        SWEET,
        SOUR,
        SALTY,
        BITTER,
        UMAMI
    }

    // Properties
    private TasteQuality quality; // Represents the taste quality

    // Constructor
    public TasteQualities(TasteQuality quality) {
        this.quality = quality;
    }

    // Getter and Setter methods
    public TasteQuality getQuality() {
        return quality;
    }

    public void setQuality(TasteQuality quality) {
        this.quality = quality;
    }

    // Method to describe the taste quality
    public void describe() {
    }
}