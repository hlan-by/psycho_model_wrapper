package figures;

import ai_models.AIModelSearchFigure;
import desires.Desire;
import percepts.CombinedPercept;
import percepts.Percept;

import java.util.List;

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

    public List<Desire> getDesires() {
        return desires;
    }

    public void setDesires(List<Desire> desires) {
        this.desires = desires;
    }

    private Figure[] figures;
    private List<Desire> desires;

    public Figure find(CombinedPercept combinatedPercept, List<Desire> desires, Figure... figures) {
        return new AIModelSearchFigure(combinatedPercept, desires, figures).getFigureOrCreateNewOne();
    }
}
