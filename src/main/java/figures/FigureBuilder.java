package figures;

import desires.Desire;
import figures.meanings.MeaningBuilder;
import percepts.CombinedPercept;
import percepts.Percept;

import java.util.List;

/**
 * Example:
 * Percept percept = new FigureBuilder()
 * .withFiguresAndCurrentPercept(combinedPercept, desire, figures)
 * .build();
 */
public class FigureBuilder {
    private Percept percept;

    public Percept getPercept() {
        return percept;
    }

    public void setPercept(Percept percept) {
        this.percept = percept;
    }

    public Figure[] getFigures() {
        return figures;
    }

    public void setFigures(Figure[] figures) {
        this.figures = figures;
    }

    public List<Desire> getDesires() {
        return desires;
    }

    public void setDesires(List<Desire> desires) {
        this.desires = desires;
    }

    private Figure[] figures;
    private List<Desire> desires;

    // Updated FigureBuilder to include Meaning creation

    public FigureBuilder withFiguresAndCurrentPercept(Percept percept, List<Desire> desires, Figure... figures) {
        this.percept = percept;
        this.figures = figures;
        this.desires = desires;
        return this;
    }

    public SpecificFigure buildSpecificFigure() {
        return new SpecificFigure()
                .setFigures(figures)
                .setPercept(percept)
                .setDesires(desires);
    }

    public MeaningBuilder buildMeaning(String symbol) {
        return new MeaningBuilder()
                .withSymbol(symbol)
                .withPercept(this.percept)
                .withDesires(this.desires);
    }
}
