package emotions.core;

import percepts.Percept;

public abstract class BaseCoreEmotion implements CoreEmotion {
    private final Percept percept;

    public BaseCoreEmotion(Percept percept) {
        this.percept = percept;
    }

    @Override
    public Object getIntentionalObject() {
        return percept;
    }
}
