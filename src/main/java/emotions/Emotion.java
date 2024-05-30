package emotions;

public interface Emotion {
    double oldIntentionalValue = 0;
    double deltaIntentionalValue = 0;
    double emotionValue = oldIntentionalValue*deltaIntentionalValue;
}
