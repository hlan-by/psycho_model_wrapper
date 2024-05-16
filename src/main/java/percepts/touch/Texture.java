package percepts.touch;

public class Texture {
    // Enum to represent different texture attributes
    public enum TextureAttribute {
        SMOOTH,
        ROUGH,
        HARD,
        SOFT
    }

    // Properties
    private TextureAttribute attribute; // Represents the texture attribute

    // Constructor
    public Texture(TextureAttribute attribute) {
        this.attribute = attribute;
    }

    // Getter and Setter methods
    public TextureAttribute getAttribute() {
        return attribute;
    }

    public void setAttribute(TextureAttribute attribute) {
        this.attribute = attribute;
    }
}