package emotions;

public interface Emotion {
    
    default Affect getAffect() {
        return new Affect(0, 0);
    }
    
    default double getForce() {
        return 0;
    }
    
    default double getSignificanceOfIntentional() {
        return 0;
    }

    default Object getIntentionalObject() {
        return null;
    }
}
