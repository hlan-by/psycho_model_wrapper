package feelings;


import emotions.Affect;
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

    public SpecificFeeling(CoreEmotion basicEmotion, KeyEmotion keyEmotion) {
        if (basicEmotion == null || keyEmotion == null) {
            throw new IllegalArgumentException("Both basic and key emotions are required to create a Feeling.");
        }
        this.basicEmotion = basicEmotion;
        this.keyEmotion = keyEmotion;
    }

    CoreEmotion basicEmotion = null;
    KeyEmotion keyEmotion = null;

    public Affect getAffect() {
        Affect affect1 = basicEmotion.getAffect();
        Affect affect2 = keyEmotion.getAffect();
        return new Affect(affect1.getValue() + affect2.getValue(), affect1.getEnergy() + affect2.getEnergy());
    }
}
