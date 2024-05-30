package conscience;

import feels.Feel;

public interface IAm {
    Feel previousFeel = null;
    Feel currentFeel = null;

    SelfAwareEntity compareFeels();
    void setPreviousFeel(Feel feel);
    void setCurrentFeel(Feel feel);
    Feel getPreviousFeel();
    Feel getCurrentFeel();
}