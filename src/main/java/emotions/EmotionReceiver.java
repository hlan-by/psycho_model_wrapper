package emotions;

import desires.Desire;
import emotions.core.CoreEmotion;
import percepts.Percept;

public class EmotionReceiver implements CoreEmotion {
    private final Emotion emotion;

    public EmotionReceiver(Percept percept, Desire desire) {
        this.emotion = searchEmotion(percept, desire);
    }

    private Emotion searchEmotion(Percept percept, Desire desire) {
        return null;
    }
}
