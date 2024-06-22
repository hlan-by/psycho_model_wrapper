package ai_models;

import desires.Desire;
import desires.SatisfactionLevel;
import figures.Figure;
import percepts.CombinatedPercept;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class AIModelSearchFigure implements Figure {
    public AIModelSearchFigure(CombinatedPercept combinatedPercept, List<Desire> desire, Figure[] figures) {

    }

    public Figure getFigureOrCreateNewOne() {
        return null;//todo find the figure
    }

    @Override
    public Map<Desire, SatisfactionLevel> getSatisfactionLevels() {
        return Collections.emptyMap();
    }

    @Override
    public int getNeedSatisfaction(Desire need) {
        return 0;
    }

    @Override
    public void setNeedSatisfaction(Desire need, int value) {

    }

    @Override
    public void setSatisfactionLevel(Desire need, SatisfactionLevel level) {

    }

    @Override
    public SatisfactionLevel getSatisfactionLevel(Desire need) {
        return null;
    }
}
