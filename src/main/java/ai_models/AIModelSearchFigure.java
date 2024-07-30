package ai_models;

import desires.Desire;
import desires.SatisfactionLevel;
import emotions.key.KeyEmotion;
import figures.Figure;
import percepts.CombinedPercept;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class AIModelSearchFigure implements Figure {
    public AIModelSearchFigure(CombinedPercept combinatedPercept, List<Desire> desire, Figure[] figures) {

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

    @Override
    public KeyEmotion getKeyEmotion() {
        return null;//todo
    }
}
