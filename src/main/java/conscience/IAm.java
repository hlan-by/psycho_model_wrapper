package conscience;

import feelings.Feeling;

public interface IAm {
    Feeling previousFeel = null;
    Feeling currentFeel = null;

    SelfAwareEntity compareFeels();
    void setPreviousFeel(Feeling feel);
    void setCurrentFeel(Feeling feel);
    Feeling getPreviousFeel();
    Feeling getCurrentFeel();
}