package figures;

import desires.Desire;
import desires.SatisfactionLevel;
import percepts.Percept;

import java.util.List;
import java.util.Map;

public class SpecificFigure implements Figure {
    private Percept percept;
    private Map<Desire, Integer> needsSatisfaction;
    private Map<Desire, SatisfactionLevel> satisfactionLevels;
    private Figure[] figures;
    private double intentionalValue;


    public Map<Desire, Integer> getNeedsSatisfaction() {
        return needsSatisfaction;
    }

    public void setNeedsSatisfaction(Map<Desire, Integer> needsSatisfaction) {
        this.needsSatisfaction = needsSatisfaction;
    }

    public Map<Desire, SatisfactionLevel> getSatisfactionLevels() {
        return satisfactionLevels;
    }

    public void setSatisfactionLevels(Map<Desire, SatisfactionLevel> satisfactionLevels) {
        this.satisfactionLevels = satisfactionLevels;
    }

    public List<Desire> getDesires() {
        return desires;
    }

    public double getIntentionalValue() {
        return intentionalValue;
    }
    public void setIntentionalValue(double intentionalValue) {
        this.intentionalValue = intentionalValue;
    }


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


    public SpecificFigure setDesires(List<Desire> desires) {
        this.desires = desires;
        return this;
    }
    private List<Desire> desires;

    public Figure get() {
        return this;
    }



    public void setNeedSatisfaction(Desire need, int value) {
        needsSatisfaction.put(need, value);
    }

    public void setSatisfactionLevel(Desire need, SatisfactionLevel level) {
        satisfactionLevels.put(need, level);
    }

    public int getNeedSatisfaction(Desire need) {
        return needsSatisfaction.getOrDefault(need, 0);
    }

    public SatisfactionLevel getSatisfactionLevel(Desire need) {
        return satisfactionLevels.getOrDefault(need, SatisfactionLevel.COMFORTABLE);
    }
}