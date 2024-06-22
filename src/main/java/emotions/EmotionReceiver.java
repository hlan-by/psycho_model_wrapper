package emotions;

import desires.Desire;
import emotions.core.*;
import percepts.Percept;

public class EmotionReceiver implements CoreEmotion {
    private final CoreEmotion emotion;

    public EmotionReceiver(Percept percept, Desire desire) {
        this.emotion = searchEmotion(percept, desire);
    }

    private CoreEmotion searchEmotion(Percept percept, Desire desire) {
        if (isContactWithObjectRisingExtremly()) {
            return new Surprise();
        }
        if (isAcceptableDesireRising()) {
            return new LikingInterest();
        }
        if (!isAcceptableDesireRising()) {
            return new Sadness();
        }
        if (isExcessiveDesireRising()) {
            return new WrongnessDisgust();
        }
        if (!isExcessiveDesireRising()) {
            return new PleasureSatisfaction();
        }
        if (isFrustrationOfDesireRising()) {
            return new HumiliationFear();
        }
        if (!isFrustrationOfDesireRising()) {
            return new ReliefJoy();
        }
        if (!isAcceptableDesireRising() && (isFrustrationOfDesireRising() || isExcessiveDesireRising())
                && isLikingInterestPresent() && (isHumiliationFearPresent() || isWrongnessDisgustPresent())) {
            return new Anger();
        }
        return null;
    }

    private boolean isContactWithObjectRisingExtremly() {
        return false;
    }

    private boolean isWrongnessDisgustPresent() {
        return false;
    }

    private boolean isHumiliationFearPresent() {
        return false;
    }

    private boolean isLikingInterestPresent() {
        return false;
    }

    private boolean isFrustrationOfDesireRising() {
        return false;
    }

    private boolean isExcessiveDesireRising() {
        return false;
    }

    private boolean isAcceptableDesireRising() {
        return false;
    }
}
