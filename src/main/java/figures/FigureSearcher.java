package figures;

import ai_models.AIModelSearchFigure;
import desires.SpecificDesire;
import percepts.CombinatedPercept;
import percepts.Percept;

/**Example:
 * Percept percept = new FigureBuilder()
 *                             .withFiguresAndCurrentPercept(combinatedPercept, desire, figures)
 *                             .build();
 *                             */
public class FigureSearcher {
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

    public Figure find(CombinatedPercept combinatedPercept, SpecificDesire desire, Figure... figures) {
        return new AIModelSearchFigure(combinatedPercept, desire, figures).getFigureOrCreateNewOne();
    }
}
