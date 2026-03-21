package figures;

import desires.Desire;
import desires.SatisfactionLevel;
import emotions.Affect;
import emotions.core.CoreEmotion;
import emotions.key.KeyEmotion;
import percepts.Percept;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpecificFigure implements Figure {
    private String id;
    private Percept percept;
    private Map<Desire, Integer> needsSatisfaction = new HashMap<>();
    private Map<Desire, SatisfactionLevel> satisfactionLevels = new HashMap<>();
    private Figure[] figures;
    private double intentionalValue;
    private KeyEmotion keyEmotion;
    private CoreEmotion baseEmotion;
    private Affect affect;
    private Desire sourceDrive;
    private long timestamp;
    private int activationCount;
    private List<Desire> desires;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public Figure get() {
        return this;
    }

    public SpecificFigure setKeyEmotion(KeyEmotion keyEmotion) {
        this.keyEmotion = keyEmotion;
        return this;
    }

    public CoreEmotion getBaseEmotion() {
        return baseEmotion;
    }

    public SpecificFigure setBaseEmotion(CoreEmotion baseEmotion) {
        this.baseEmotion = baseEmotion;
        return this;
    }

    public Affect getAffect() {
        return affect;
    }

    public SpecificFigure setAffect(Affect affect) {
        this.affect = affect;
        return this;
    }

    public Desire getSourceDrive() {
        return sourceDrive;
    }

    public SpecificFigure setSourceDrive(Desire sourceDrive) {
        this.sourceDrive = sourceDrive;
        return this;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public SpecificFigure setTimestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public int getActivationCount() {
        return activationCount;
    }

    public SpecificFigure setActivationCount(int activationCount) {
        this.activationCount = activationCount;
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

    @Override
    public KeyEmotion getKeyEmotion() {
        return keyEmotion;
    }
}
