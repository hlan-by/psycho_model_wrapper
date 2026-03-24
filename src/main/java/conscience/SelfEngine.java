package conscience;

import feelings.SelfFeeling;

public class SelfEngine {
    private MindState previous;
    private MindState current;

    public SelfFeeling update(MindState newState) {
        this.previous = this.current;
        this.current = newState;

        if (this.previous == null) {
            return null; // No self-awareness yet (need at least two states)
        }

        return SelfFeeling.fromDelta(this.previous, this.current);
    }
}
