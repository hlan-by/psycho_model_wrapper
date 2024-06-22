package emotions;

public interface Emotion {
    double oldIntentionalValue = 0;
    double deltaIntentionalValue = 0;
    double emotionValue = oldIntentionalValue * deltaIntentionalValue;
    double forceOfDesire = 0;
    double significanceOfIntentional = 0;
    double forceOfPerceptStimulation = 0;
    double force = forceOfDesire * significanceOfIntentional * forceOfPerceptStimulation;
    double term = 0;
    EmotionLevel satisfactionLevel = null;
    //todo trigger percept+desire - figure where percept+desire depends on force, level, kind AND figure depends on Significance
}
