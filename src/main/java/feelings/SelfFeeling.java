package feelings;

import conscience.MindState;
import emotions.Affect;
import emotions.core.*;
import emotions.key.*;

public class SelfFeeling extends SpecificFeeling {

    private SelfFeeling(CoreEmotion core, KeyEmotion key) {
        super(core, key);
    }

    public static SelfFeeling fromDelta(MindState prev, MindState curr) {
        if (prev == null || curr == null) {
            // Default initial state
            return new SelfFeeling(new LikingInterest(null), new InterestI());
        }

        Affect prevAffect = prev.getTotalAffect();
        Affect currAffect = curr.getTotalAffect();
        
        double deltaValue = currAffect.getValue() - prevAffect.getValue();
        double deltaEnergy = currAffect.getEnergy() - prevAffect.getEnergy();
        double deltaIntentionality = curr.getTotalIntentionality() - prev.getTotalIntentionality();

        CoreEmotion core;
        KeyEmotion key;

        // Logic to determine emotions based on deltas
        if (deltaValue > 0.1) {
            // Positive shift
            if (deltaIntentionality > 0) {
                // Growth / Confidence
                core = new PleasureSatisfaction(null);
                key = new JoyI(); 
            } else {
                // Relief / Relaxation
                core = new ReliefJoy(null);
                key = new PleasureI();
            }
        } else if (deltaValue < -0.1) {
            // Negative shift
            if (deltaEnergy > 0) {
                // Active negativity (Anger/Fear)
                core = new HumiliationFear(null); // Or Anger if supported
                key = new FearI();
            } else {
                // Passive negativity (Sadness)
                core = new Sadness(null);
                key = new SadnessI();
            }
        } else {
            // Neutral / Stability check
            if (Math.abs(deltaIntentionality) > 5.0) {
                // High instability
                core = new Surprise(null);
                key = new SurpriseI();
            } else {
                // Stable
                core = new LikingInterest(null);
                key = new InterestI();
            }
        }
        
        // Handle extreme negative shift
        if (deltaValue < -0.5) {
             core = new HumiliationFear(null);
             key = new FearI();
        }

        return new SelfFeeling(core, key);
    }
}
