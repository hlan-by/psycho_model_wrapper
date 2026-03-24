package figures.meanings;

import desires.Desire;
import desires.SatisfactionLevel;
import emotions.Affect;
import emotions.core.CoreEmotion;
import emotions.key.KeyEmotion;
import figures.Figure;
import intentional_modules.Action;
import intentional_modules.Plan;
import percepts.Percept;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// New Meaning class that implements Figure
public class Meaning implements Figure {
    private String symbol;
    private Figure referent;
    private Percept percept;
    private Map<Desire, Integer> needsSatisfaction;
    private Map<Desire, SatisfactionLevel> satisfactionLevels;
    private double intentionalValue;
    private Affect affect;
    private Desire sourceDrive;
    private CoreEmotion baseEmotion;
    private long timestamp;
    private int activationCount;

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
    public double getIntentionalValue() {
        return intentionalValue;
    }

    @Override
    public void setIntentionalValue(double value) {
        this.intentionalValue = value;
    }

    @Override
    public Affect getAffect() {
        return affect;
    }

    @Override
    public Figure setAffect(Affect affect) {
        this.affect = affect;
        return this;
    }

    @Override
    public Desire getSourceDrive() {
        return sourceDrive;
    }

    @Override
    public Figure setSourceDrive(Desire sourceDrive) {
        this.sourceDrive = sourceDrive;
        return this;
    }

    @Override
    public CoreEmotion getBaseEmotion() {
        return baseEmotion;
    }

    @Override
    public Figure setBaseEmotion(CoreEmotion baseEmotion) {
        this.baseEmotion = baseEmotion;
        return this;
    }

    @Override
    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public Figure setTimestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @Override
    public int getActivationCount() {
        return activationCount;
    }

    @Override
    public Figure setActivationCount(int count) {
        this.activationCount = count;
        return this;
    }

    @Override
    public Plan getLastPlan() {
        return null;
    }

    @Override
    public Figure setLastPlan(Plan plan) {
        return this;
    }

    @Override
    public Action getLastAction() {
        return null;
    }

    @Override
    public Figure setLastAction(Action action) {
        return this;
    }

    @Override
    public Map<Desire, Double> getDriveWeights() {
        return Collections.emptyMap();
    }

    @Override
    public Map<Desire, Double> getLastDriveImpact() {
        return Collections.emptyMap();
    }

    @Override
    public Figure setLastDriveImpact(Map<Desire, Double> impact) {
        return this;
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
