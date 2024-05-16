package figures;

import percepts.CombinatedPercept;
import percepts.Percept;
import urges.SpecificUrge;

/**Example:
 * Percept percept = new FigureBuilder()
 *                             .withFiguresAndCurrentPercept(combinatedPercept, urge, figures)
 *                             .build();
 *                             */
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

    public SpecificUrge getUrge() {
        return urge;
    }

    public void setUrge(SpecificUrge urge) {
        this.urge = urge;
    }

    private Figure[] figures;
    private SpecificUrge urge;

    public FigureBuilder withFiguresAndCurrentPercept(CombinatedPercept combinatedPercept, SpecificUrge urge, Figure... figures) {
        this.percept = combinatedPercept;
        this.figures = figures;
        this.urge = urge;
        return this;
    }
}
