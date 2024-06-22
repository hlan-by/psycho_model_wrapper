package figures;

import desires.Desire;
import percepts.CombinatedPercept;
import percepts.Percept;

import java.util.List;

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

    public List<Desire> getDesires() {
        return desires;
    }

    public void setDesires(List<Desire> desires) {
        this.desires = desires;
    }

    private Figure[] figures;
    private List<Desire> desires;

    public Figure withFiguresAndCurrentPercept(CombinatedPercept combinatedPercept, List<Desire> desires, Figure... figures) {
        this.percept = combinatedPercept;
        this.figures = figures;
        this.desires = desires;
        return new SpecificFigure().setFigures(figures).setPercept(percept).setDesires(desires);
    }
}
