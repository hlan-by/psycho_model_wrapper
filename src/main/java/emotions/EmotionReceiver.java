package emotions;

import desires.Desire;
import emotions.core.*;
import percepts.Percept;

public class EmotionReceiver {

    public static CoreEmotion create(Percept percept, Desire desire) {
        if (isContactWithObjectRisingExtremly()) {
            return new Surprise(percept);
        }
        if (isAcceptableDesireRising()) {
            return new LikingInterest(percept);
        }
        if (!isAcceptableDesireRising()) {
            return new Sadness(percept);
        }
        if (isExcessiveDesireRising()) {
            return new WrongnessDisgust(percept);
        }
        if (!isExcessiveDesireRising()) {
            return new PleasureSatisfaction(percept);
        }
        if (isFrustrationOfDesireRising()) {
            return new HumiliationFear(percept);
        }
        if (!isFrustrationOfDesireRising()) {
            return new ReliefJoy(percept);
        }
        if (!isAcceptableDesireRising() && (isFrustrationOfDesireRising() || isExcessiveDesireRising())
                && isLikingInterestPresent() && (isHumiliationFearPresent() || isWrongnessDisgustPresent())) {
            return new Anger(percept);
        }
        return null;
    }

    private static boolean isContactWithObjectRisingExtremly() {
        return false;
    }

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

    private static boolean isAcceptableDesireRising() {
        return false;
    }
}
