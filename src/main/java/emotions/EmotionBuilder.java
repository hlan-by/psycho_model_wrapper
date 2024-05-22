package emotions;

import desires.Desire;
import images.Image;

public class EmotionBuilder {
    public Emotion build(Image image, Desire desireToNegotiate) {
        double imageFeedBackValue = image.getSpecificDesire(desireToNegotiate).getImpact();
        if (desireToNegotiate.getMinAllowedFeedbackLevel() > imageFeedBackValue) {
            return null;
        }
        if (desireToNegotiate.getUnacceptableLowLevel() > imageFeedBackValue) {
            return new FearBasic();
        }
        if (desireToNegotiate.getUnacceptableHighLevel() < imageFeedBackValue) {
            return new AngerBasic();
        }
        return new ReliefPleasureBasic();//todo clarify Emotions to return
    }
}
