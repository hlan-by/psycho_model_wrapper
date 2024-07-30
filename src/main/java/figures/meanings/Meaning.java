package figures.meanings;

import desires.Desire;
import desires.SatisfactionLevel;
import emotions.key.KeyEmotion;
import figures.Figure;
import percepts.Percept;

import java.util.HashMap;
import java.util.Map;

// New Meaning class that implements Figure
public class Meaning implements Figure {
    private String symbol;
    private Figure referent;
    private Percept percept;
    private Map<Desire, Integer> needsSatisfaction;
    private Map<Desire, SatisfactionLevel> satisfactionLevels;

    public Meaning(String symbol, Figure referent) {
        this.symbol = symbol;
        this.referent = referent;
        this.needsSatisfaction = new HashMap<>();
        this.satisfactionLevels = new HashMap<>();
    }

    public String getSymbol() {
        return symbol;
    }

    public Figure getReferent() {
        return referent;
    }

    public Percept getPercept() {
        return percept;
    }

    public void setPercept(Percept percept) {
        this.percept = percept;
    }

    @Override
    public Map<Desire, SatisfactionLevel> getSatisfactionLevels() {
        return satisfactionLevels;
    }

    @Override
    public int getNeedSatisfaction(Desire need) {
        return needsSatisfaction.getOrDefault(need, 0);
    }

    @Override
    public void setNeedSatisfaction(Desire need, int value) {
        needsSatisfaction.put(need, value);
    }

    @Override
    public void setSatisfactionLevel(Desire need, SatisfactionLevel level) {
        satisfactionLevels.put(need, level);
    }

    @Override
    public SatisfactionLevel getSatisfactionLevel(Desire need) {
        return satisfactionLevels.getOrDefault(need, SatisfactionLevel.COMFORTABLE);
    }

    @Override
    public KeyEmotion getKeyEmotion() {
        return null;//todo
    }

    @Override
    public String toString() {
        return "Meaning{" +
                "symbol='" + symbol + '\'' +
                ", referent=" + referent +
                ", percept=" + percept +
                ", satisfactionLevels=" + satisfactionLevels +
                '}';
    }
}
