package images;

import figures.Figure;
import sences.SpecificSense;

public class ImageBuilder {

    public Figure getFigure() {
        return figure;
    }

    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    public SpecificSense[] getSenses() {
        return senses;
    }

    public void setSenses(SpecificSense[] senses) {
        this.senses = senses;
    }

    private Figure figure;
    private SpecificSense[] senses;

    public SpecificImage build(Figure figure, SpecificSense[] senses) {
        this.figure = figure;
        this.senses = senses;
        return new SpecificImage().setFigure(figure).setSpecificSenses(senses);
    }
}
