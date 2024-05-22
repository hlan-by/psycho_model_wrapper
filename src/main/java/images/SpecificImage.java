package images;

import desires.Desire;
import emotions.Emotion;
import figures.Figure;
import sences.SpecificSense;

public class SpecificImage implements Image {
    private SpecificSense[] senses;

    public SpecificImage setSpecificSenses(SpecificSense[] senses) {
        this.senses = senses;
        return this;
    }

    public Figure getFigure() {
        return figure;
    }

    public SpecificImage setFigure(Figure figure) {
        this.figure = figure;
        return this;
    }

    public Emotion getEmotion() {
        return emotion;
    }

    public SpecificImage setEmotion(Emotion emotion) {
        this.emotion = emotion;
        return this;
    }

    private Figure figure;
    private Emotion emotion;

    @Override
    public Desire getSpecificDesire(Desire desireToNegotiate) {
      return getFigure().getDesire(desireToNegotiate);
    }
}