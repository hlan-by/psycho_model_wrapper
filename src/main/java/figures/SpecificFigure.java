package figures;

import desires.SpecificDesire;
import percepts.CombinatedPercept;
import percepts.Percept;

/**
 * Example:
 * Percept percept = new FigureBuilder()
 * .withFiguresAndCurrentPercept(combinatedPercept, desire, figures)
 * .build();
 */
public class SpecificFigure implements Figure {
    private Percept percept;

    public Percept getPercept() {
        return percept;
    }

    public SpecificFigure setPercept(Percept percept) {
        this.percept = percept;
        return this;
    }

    public Figure[] getFigures() {
        return figures;
    }

    public SpecificFigure setFigures(Figure[] figures) {
        this.figures = figures;
        return this;
    }

    public SpecificDesire getDesire() {
        return desire;
    }

    public SpecificFigure setDesire(SpecificDesire desire) {
        this.desire = desire;
        return this;
    }

    private Figure[] figures;
    private SpecificDesire desire;

    public Figure get() {
        return this;
    }
}