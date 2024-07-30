package feelings;

import emotions.core.*;
import emotions.key.AngerI;
import emotions.key.AngerOther;
import emotions.key.DisgustI;
import emotions.key.DisgustOther;
import emotions.key.FearI;
import emotions.key.FearOther;
import emotions.key.InterestI;
import emotions.key.InterestOther;
import emotions.key.JoyI;
import emotions.key.JoyOther;
import emotions.key.PleasureI;
import emotions.key.PleasureOther;
import emotions.key.SadnessI;
import emotions.key.SadnessOther;
import emotions.key.SurpriseI;
import emotions.key.SurpriseOther;
import feelings.collection.Acceptance;
import feelings.collection.Admiration;
import feelings.collection.Aggression;
import feelings.collection.Amazement;
import feelings.collection.Annoyance;
import feelings.collection.Anticipation;
import feelings.collection.Anxiety;
import feelings.collection.Apprehension;
import feelings.collection.Awkwardness;
import feelings.collection.Betrayal;
import feelings.collection.Bewilderment;
import feelings.collection.Bitterness;
import feelings.collection.CleansingAnger;
import feelings.collection.Confidence;
import feelings.collection.Confusion;
import feelings.collection.CorrectiveAnger;
import feelings.collection.Curiosity;
import feelings.collection.Disappointment;
import feelings.collection.Disbelief;
import feelings.collection.Disdain;
import feelings.collection.Disgust;
import feelings.collection.EcstasyOfAnger;
import feelings.collection.Embarrassment;
import feelings.collection.Enthusiasm;
import feelings.collection.Envy;
import feelings.collection.Exposure;
import feelings.collection.Fanaticism;
import feelings.collection.Frustration;
import feelings.collection.Gain;
import feelings.collection.Gratitude;
import feelings.collection.Grief;
import feelings.collection.Guilt;
import feelings.collection.Hatred;
import feelings.collection.Hope;
import feelings.collection.Humiliation;
import feelings.collection.Indignation;
import feelings.collection.Infatuation;
import feelings.collection.Interest;
import feelings.collection.Irritation;
import feelings.collection.Jealousy;
import feelings.collection.Joy;
import feelings.collection.JoyfulSurprise;
import feelings.collection.KeenInterest;
import feelings.collection.LightSadness;
import feelings.collection.Narcissism;
import feelings.collection.Nostalgia;
import feelings.collection.PainfulAnxiety;
import feelings.collection.Pity;
import feelings.collection.PleasantSurprise;
import feelings.collection.Pleasantness;
import feelings.collection.Recognition;
import feelings.collection.Rejoicing;
import feelings.collection.Resentment;
import feelings.collection.Resignation;
import feelings.collection.Revenge;
import feelings.collection.Revulsion;
import feelings.collection.RighteousAnger;
import feelings.collection.Satisfaction;
import feelings.collection.Schadenfreude;
import feelings.collection.Scorn;
import feelings.collection.SecretJoy;
import feelings.collection.SelfAbsorption;
import feelings.collection.SelfAdmiration;
import feelings.collection.SelfBetrayal;
import feelings.collection.SelfBlame;
import feelings.collection.SelfContempt;
import feelings.collection.SelfDeprecation;
import feelings.collection.SelfDisgust;
import feelings.collection.SelfExamination;
import feelings.collection.SelfExposure;
import feelings.collection.SelfLoathing;
import feelings.collection.SelfSatisfaction;
import feelings.collection.Servility;
import feelings.collection.ShadowOfJoy;
import feelings.collection.Shame;
import feelings.collection.Shamefulness;
import feelings.collection.Sorrow;
import feelings.collection.Submission;
import feelings.collection.Tenderness;
import feelings.collection.Timidity;
import feelings.collection.Trembling;
import feelings.collection.Warmth;
import feelings.collection.Worthlessness;

public class FeelingsMatrix {

    private static final Class<?>[] rowHeaders = {
            SurpriseOther.class, SurpriseI.class, AngerOther.class, AngerI.class, InterestOther.class,
            InterestI.class, JoyOther.class, JoyI.class, PleasureOther.class, PleasureI.class,
            SadnessOther.class, SadnessI.class, FearOther.class, FearI.class, DisgustOther.class, DisgustI.class
    };

    private static final Class<?>[] columnHeaders = {
            emotions.core.Surprise.class, emotions.core.Anger.class, LikingInterest.class, ReliefJoy.class, PleasureSatisfaction.class, emotions.core.Sadness.class, HumiliationFear.class, WrongnessDisgust.class
    };

    private static final Class<?>[][] emotionMatrix = {
            { Amazement.class, Indignation.class, emotions.core.Surprise.class, JoyfulSurprise.class, Embarrassment.class, Disappointment.class, Bewilderment.class, Confusion.class },
            { Amazement.class, emotions.core.Anger.class, Hope.class, Acceptance.class, Embarrassment.class, Disbelief.class, Embarrassment.class, Awkwardness.class },
            { Indignation.class, RighteousAnger.class, Jealousy.class, Disdain.class, Frustration.class, Revenge.class, Resentment.class, Revulsion.class },
            { Annoyance.class, Frustration.class, Aggression.class, Irritation.class, Bitterness.class, Annoyance.class, Shame.class, Guilt.class },
            { KeenInterest.class, Aggression.class, Curiosity.class, Gratitude.class, Satisfaction.class, Envy.class, Servility.class, Anticipation.class },
            { Interest.class, Aggression.class, Narcissism.class, Enthusiasm.class, Confidence.class, ShadowOfJoy.class, SelfAbsorption.class, SecretJoy.class },
            { emotions.core.Surprise.class, Schadenfreude.class, Admiration.class, Joy.class, Warmth.class, ShadowOfJoy.class, Hope.class, Hope.class },
            { SelfAdmiration.class, Schadenfreude.class, SelfAdmiration.class, Rejoicing.class, Gain.class, ShadowOfJoy.class, Hope.class, Hope.class },
            { PleasantSurprise.class, EcstasyOfAnger.class, Infatuation.class, Pleasantness.class, Recognition.class, Nostalgia.class, Fanaticism.class, Shamefulness.class },
            { SelfSatisfaction.class, SelfBlame.class, Narcissism.class, SelfSatisfaction.class, SelfSatisfaction.class, Nostalgia.class, SelfExamination.class, Shamefulness.class },
            { emotions.core.Sadness.class, Disappointment.class, Pity.class, LightSadness.class, Resignation.class, Grief.class, Humiliation.class, Disappointment.class },
            { Sorrow.class, Annoyance.class, Pity.class, LightSadness.class, Resignation.class, Grief.class, SelfDeprecation.class, Worthlessness.class },
            { Confusion.class, Hatred.class, Anxiety.class, Apprehension.class, Trembling.class, PainfulAnxiety.class, Submission.class, Disgust.class },
            { Confusion.class, Hatred.class, Timidity.class, Apprehension.class, Tenderness.class, PainfulAnxiety.class, Submission.class, Guilt.class },
            { Betrayal.class, CleansingAnger.class, Disgust.class, Exposure.class, Scorn.class, Revulsion.class, Revulsion.class, Revulsion.class },
            { SelfBetrayal.class, CorrectiveAnger.class, Disgust.class, SelfExposure.class, SelfLoathing.class, SelfContempt.class, Worthlessness.class, SelfDisgust.class }
    };

    public static String getResultingEmotionInConsumptionDesire(Class<?> coreEmotion, Class<?> keyEmotion) {
        int coreEmotionIndex = -1;
        int keyEmotionIndex = -1;

        for (int i = 0; i < rowHeaders.length; i++) {
            if (rowHeaders[i].equals(coreEmotion)) {
                coreEmotionIndex = i;
                break;
            }
        }

        for (int i = 0; i < columnHeaders.length; i++) {
            if (columnHeaders[i].equals(keyEmotion)) {
                keyEmotionIndex = i;
                break;
            }
        }

        if (coreEmotionIndex == -1 || keyEmotionIndex == -1) {
            return "Invalid emotion names";
        }

        Class<?> resultingEmotionClass = emotionMatrix[coreEmotionIndex][keyEmotionIndex];
        return resultingEmotionClass != null ? resultingEmotionClass.getSimpleName() : "No resulting emotion";
    }

    public static void main(String[] args) {
        // Example usage
        Class<?> coreEmotion = AngerI.class; // Row header
        Class<?> keyEmotion = Surprise.class; // Column header
        String resultingEmotion = getResultingEmotionInConsumptionDesire(coreEmotion, keyEmotion);
    }
}
