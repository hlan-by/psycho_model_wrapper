package ai_models;

import desires.Desire;
import desires.SatisfactionLevel;
import emotions.Affect;
import emotions.core.CoreEmotion;
import emotions.key.KeyEmotion;
import figures.Figure;
import intentional_modules.Action;
import intentional_modules.Plan;
import percepts.CombinedPercept;
import percepts.Percept;

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
    public Percept getPercept() {
        return null;//todo
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

    @Override
    public double getIntentionalValue() {
        return 0;
    }

    @Override
    public void setIntentionalValue(double value) {

    }

    @Override
    public Affect getAffect() {
        return null;
    }

    @Override
    public Figure setAffect(Affect affect) {
        return this;
    }

    @Override
    public Desire getSourceDrive() {
        return null;
    }

    @Override
    public Figure setSourceDrive(Desire sourceDrive) {
        return this;
    }

    @Override
    public CoreEmotion getBaseEmotion() {
        return null;
    }

    @Override
    public Figure setBaseEmotion(CoreEmotion baseEmotion) {
        return this;
    }

    @Override
    public long getTimestamp() {
        return 0;
    }

    @Override
    public Figure setTimestamp(long timestamp) {
        return this;
    }

    @Override
    public int getActivationCount() {
        return 0;
    }

    @Override
    public Figure setActivationCount(int count) {
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
}
