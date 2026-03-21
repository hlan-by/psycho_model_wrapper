package feelings;

import emotions.core.CoreEmotion;
import emotions.key.KeyEmotion;

public interface Feeling {
    CoreEmotion getBasicEmotion();
    KeyEmotion getKeyEmotion();
}
