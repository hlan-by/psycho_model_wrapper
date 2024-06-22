package conscience;

import feelings.Feeling;

public class SelfAwareEntity implements IAm {
    private Feeling previousFeel;
    private Feeling currentFeel;

    @Override
    public SelfAwareEntity compareFeels() {
        if (previousFeel == null || currentFeel == null) {
            return null;
        }

        if (!previousFeel.equals(currentFeel)) {
            return this;
        }
        return null;
    }

    @Override
    public void setPreviousFeel(Feeling feel) {
        this.previousFeel = feel;
    }

    @Override
    public void setCurrentFeel(Feeling feel) {
        this.currentFeel = feel;
    }

    @Override
    public Feeling getPreviousFeel() {
        return previousFeel;
    }

    @Override
    public Feeling getCurrentFeel() {
        return currentFeel;
    }
}