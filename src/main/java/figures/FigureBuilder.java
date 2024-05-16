package figures;

import percepts.CombinatedPercept;
import percepts.Percept;
import desires.SpecificDesire;

/**Example:
 * Percept percept = new FigureBuilder()
 *                             .withFiguresAndCurrentPercept(combinatedPercept, desire, figures)
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

    public SpecificDesire getDesire() {
        return desire;
    }

    public void setDesire(SpecificDesire desire) {
        this.desire = desire;
    }

    private Figure[] figures;
    private SpecificDesire desire;

    public Figure withFiguresAndCurrentPercept(CombinatedPercept combinatedPercept, SpecificDesire desire, Figure... figures) {
        this.percept = combinatedPercept;
        this.figures = figures;
        this.desire = desire;
        return new SpecificFigure().setFigures(figures).setPercept(percept).setDesire(desire);
    }
}
