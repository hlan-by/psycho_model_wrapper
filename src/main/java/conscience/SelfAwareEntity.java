package conscience;

import feels.Feel;

public class SelfAwareEntity implements IAm {
    private Feel previousFeel;
    private Feel currentFeel;

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
    public void setPreviousFeel(Feel feel) {
        this.previousFeel = feel;
    }

    @Override
    public void setCurrentFeel(Feel feel) {
        this.currentFeel = feel;
    }

    @Override
    public Feel getPreviousFeel() {
        return previousFeel;
    }

    @Override
    public Feel getCurrentFeel() {
        return currentFeel;
    }
}