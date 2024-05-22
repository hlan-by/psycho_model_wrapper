package ai_models;

import desires.Desire;
import desires.SpecificDesire;
import figures.Figure;
import percepts.CombinatedPercept;

public class AIModelSearchFigure implements Figure {
    public AIModelSearchFigure(CombinatedPercept combinatedPercept, SpecificDesire desire, Figure[] figures) {

    }

    public Figure getFigureOrCreateNewOne() {
        return null;//todo find the figure
    }

    @Override
    public Desire getDesire(Desire desireToNegotiate) {
        return null;//todo
    }
}
