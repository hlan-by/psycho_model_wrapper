package conscience;

import emotions.core.CoreEmotion;
import feelings.Feeling;
import figures.Figure;

import java.util.Set;

public class SelfAwareEntity implements IAm {
    private Feeling previousFeel;
    private Feeling currentFeel;
    private CoreEmotion specificEmotion;
    private Set<Figure> figures;
    private Attention attention;

    public SelfAwareEntity(CoreEmotion specificEmotion, Set<Figure> figures, Attention attention) {
        this.specificEmotion = specificEmotion;
        this.figures = figures;
        this.attention = attention;
    }

    @Override
    public SelfAwareEntity compareFeels() {
        if (previousFeel == null || currentFeel == null) {
            return null;
        }

        if (!previousFeel.equals(currentFeel)) {
            return this;
        }
        return null;
    }

    @Override
    public void setPreviousFeel(Feeling feel) {
        this.previousFeel = feel;
    }

    @Override
    public void setCurrentFeel(Feeling feel) {
        this.currentFeel = feel;
    }

    @Override
    public Feeling getPreviousFeel() {
        return previousFeel;
    }

    @Override
    public Feeling getCurrentFeel() {
        return currentFeel;
    }

    public CoreEmotion getCoreEmotion() {
        return specificEmotion;
    }

    public void setCoreEmotion(CoreEmotion specificEmotion) {
        this.specificEmotion = specificEmotion;
    }

    public Set<Figure> getFigures() {
        return figures;
    }

    public void setFigures(Set<Figure> figures) {
        this.figures = figures;
    }

    public Attention getAttention() {
        return attention;
    }

    public void setAttention(Attention attention) {
        this.attention = attention;
    }

    public Feeling getNewFeeling() {
        return attention.getResultingEmotion(specificEmotion, figures);
    }

    public Feeling getEuphoricFeeling() {
        return attention.attachToFigureForEuphoricEmotion(figures);
    }

    @Override
    public String toString() {
        return "SelfAwareEntity{" +
                "previousFeel=" + previousFeel +
                ", currentFeel=" + currentFeel +
                ", specificEmotion=" + specificEmotion +
                ", figures=" + figures +
                ", attention=" + attention +
                '}';
    }
}