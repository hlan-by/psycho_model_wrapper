package memories;

import desires.Desire;
import emotions.Affect;
import emotions.core.CoreEmotion;
import emotions.key.KeyEmotion;
import figures.SpecificFigure;
import percepts.Percept;

import java.util.List;

public class FigureEmbeddingStrategy {

    // These dimensions would ideally be tuned based on the model.
    // For this simulation, we'll assign fixed dimensions.
    private static final int PERCEPT_DIM = 64;
    private static final int DESIRE_DIM = 16;
    private static final int EMOTION_DIM = 16;
    private static final int INTENTIONAL_DIM = 1;
    public static final int TOTAL_DIM = PERCEPT_DIM + DESIRE_DIM + EMOTION_DIM + INTENTIONAL_DIM;

    public float[] embed(SpecificFigure figure) {
        float[] vector = new float[TOTAL_DIM];
        int offset = 0;

        // 1. Percept Features
        float[] perceptVector = embedPercept(figure.getPercept());
        System.arraycopy(perceptVector, 0, vector, offset, Math.min(perceptVector.length, PERCEPT_DIM));
        offset += PERCEPT_DIM;

        // 2. Desires
        float[] desireVector = embedDesires(figure.getDesires());
        System.arraycopy(desireVector, 0, vector, offset, Math.min(desireVector.length, DESIRE_DIM));
        offset += DESIRE_DIM;

        // 3. Emotional State
        float[] emotionVector = embedEmotion(figure.getBaseEmotion(), figure.getKeyEmotion(), figure.getAffect());
        System.arraycopy(emotionVector, 0, vector, offset, Math.min(emotionVector.length, EMOTION_DIM));
        offset += EMOTION_DIM;

        // 4. Intentional Value
        vector[offset] = (float) figure.getIntentionalValue();

        return vector;
    }

    public float[] embedPercept(Percept percept) {
        // Placeholder: Convert Percept to vector.
        // In a real system, this would use an image/audio embedding model or feature extraction.
        float[] v = new float[PERCEPT_DIM];
        if (percept != null) {
             // Mocking features based on object hash or properties
             // This is a simplification.
             v[0] = percept.hashCode() % 100 / 100.0f;
        }
        return v;
    }

    public float[] embedDesires(List<Desire> desires) {
        float[] v = new float[DESIRE_DIM];
        if (desires != null) {
            for (int i = 0; i < Math.min(desires.size(), DESIRE_DIM); i++) {
                v[i] = desires.get(i).hashCode() % 100 / 100.0f; 
            }
        }
        return v;
    }

    public float[] embedEmotion(CoreEmotion base, KeyEmotion key, Affect affect) {
        float[] v = new float[EMOTION_DIM];
        int i = 0;
        if (base != null) v[i++] = base.hashCode() % 100 / 100.0f;
        if (key != null) v[i++] = key.hashCode() % 100 / 100.0f;
        if (affect != null) {
            v[i++] = (float) affect.getValue();
            v[i++] = (float) affect.getEnergy();
        }
        return v;
    }

    public float[] embedDrive(Desire drive) {
         float[] v = new float[DESIRE_DIM];
         if (drive != null) {
             v[0] = (float) drive.getImpact();
             v[1] = (float) drive.getFeedBackLevel();
             v[2] = (float) drive.getMaxAllowedImpactLevel();
         }
         return v;
    }
}
