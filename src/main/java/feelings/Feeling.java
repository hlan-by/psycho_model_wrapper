package feelings;

import emotions.Affect;
import emotions.core.CoreEmotion;
import emotions.key.KeyEmotion;

public interface Feeling {
    CoreEmotion getBasicEmotion();
    KeyEmotion getKeyEmotion();

    default Affect getAffect() {
        CoreEmotion basic = getBasicEmotion();
        KeyEmotion key = getKeyEmotion();
        if (basic == null || key == null) {
            return new Affect(0, 0);
        }
        // Combine the affects of the two emotions
        double combinedValue = (basic.getAffect().getValue() + key.getAffect().getValue()) / 2;
        double combinedEnergy = basic.getAffect().getEnergy() + key.getAffect().getEnergy();
        return new Affect(combinedValue, combinedEnergy);
    }
}
