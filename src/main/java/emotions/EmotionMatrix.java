package emotions;

import emotions.core.*;
import emotions.core.Surprise;
import emotions.key.*;
import emotions.result.*;

public class EmotionMatrix {

    private static final Class<?>[] rowHeaders = {
            SurpriseOther.class, SurpriseI.class, AngerOther.class, AngerI.class, InterestOther.class,
            InterestI.class, JoyOther.class, JoyI.class, PleasureOther.class, PleasureI.class,
            SadnessOther.class, SadnessI.class, FearOther.class, FearI.class, DisgustOther.class, DisgustI.class
    };

    private static final Class<?>[] columnHeaders = {
            emotions.core.Surprise.class, emotions.core.Anger.class, LikingInterest.class, SupportJoy.class, RecognitionSatisfaction.class, emotions.core.Sadness.class, HumiliationFear.class, WrongnessDisgust.class
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

    public static String getResultingEmotion(Class<?> coreEmotion, Class<?> keyEmotion) {
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
        String resultingEmotion = getResultingEmotion(coreEmotion, keyEmotion);
    }
}
