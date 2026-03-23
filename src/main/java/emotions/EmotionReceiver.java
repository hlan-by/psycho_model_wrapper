package emotions;

import desires.Desire;
import emotions.core.*;
import figures.Figure;
import percepts.Percept;

public class EmotionReceiver {

    public static CoreEmotion create(Percept percept, Desire desire) {
        // This method can be kept for backward compatibility or simple cases
        if (isContactWithObjectRisingExtremly(null)) {
            return new Surprise(percept);
        }
        // ... existing logic
        return null;
    }

    public static CoreEmotion create(Figure figure, Desire desire) {
        if (isContactWithObjectRisingExtremly(figure)) {
            return new Surprise(figure.getPercept());
        }
        if (isAcceptableDesireRising(figure, desire)) {
            return new LikingInterest(figure.getPercept());
        }
        if (!isAcceptableDesireRising(figure, desire)) {
            return new Sadness(figure.getPercept());
        }
        // ... more detailed logic using figure properties
        return null;
    }

    private static boolean isContactWithObjectRisingExtremly(Figure figure) {
        // Placeholder logic
        return false;
    }

    private static boolean isAcceptableDesireRising(Figure figure, Desire desire) {
        // Placeholder logic
        if (figure != null && desire != null) {
            return figure.getNeedSatisfaction(desire) > 50;
        }
        return false;
    }
    
    // Other placeholder methods from before
    private static boolean isWrongnessDisgustPresent() {
        return false;
    }

    private static boolean isHumiliationFearPresent() {
        return false;
    }

    private static boolean isLikingInterestPresent() {
        return false;
    }

    private static boolean isFrustrationOfDesireRising() {
        return false;
    }

    private static boolean isExcessiveDesireRising() {
        return false;
    }
}
