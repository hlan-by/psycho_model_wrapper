package feelings;


import emotions.core.CoreEmotion;
import emotions.key.KeyEmotion;

public class SpecificFeeling implements Feeling {
    public CoreEmotion getBasicEmotion() {
        return basicEmotion;
    }

    public SpecificFeeling setBasicEmotion(CoreEmotion basicEmotion) {
        this.basicEmotion = basicEmotion;
        return this;
    }

    public KeyEmotion getKeyEmotion() {
        return keyEmotion;
    }

    public SpecificFeeling setKeyEmotion(KeyEmotion keyEmotion) {
        this.keyEmotion = keyEmotion;
        return this;
    }

    CoreEmotion basicEmotion = null;
    KeyEmotion keyEmotion = null;

}