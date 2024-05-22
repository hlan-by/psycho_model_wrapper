package desires;

public interface Desire {
    double getImpact();
    double getFeedBackLevel();
    double getMinAllowedFeedbackLevel();
    double getMaxAllowedImpactLevel();
    double getUnacceptableLowLevel();
    double getUnacceptableHighLevel();
    void setFeedBackLevel(double level);
}
