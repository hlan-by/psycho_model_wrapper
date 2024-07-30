package desires;

import emotions.core.PleasureSatisfaction;

public class ConsumptionDesireBasic implements Desire {
    private PleasureSatisfaction pleasureSatisfaction;
    private double impact;
    private double feedBackLevel;
    private double MAX_ALLOWED_IMPACT_LEVEL = 10E19;//todo setup correct value
    private double MIN_ALLOWED_FEEDBACK_LEVEL = 10;//todo setup correct value. if less, no connection allowed
    private double UNACCEPTABLE_HIGH_LEVEL = 10E15;//todo setup correct value. if more, produces dicomfort, unpleasure rise
    private double UNACCEPTABLE_LOW_LEVEL = 100;//todo setup correct value. if less, impact frustated, unpleasure rise

    public PleasureSatisfaction getPleasure() {
        return pleasureSatisfaction;
    }

    public void setImpact(double impact) {
        this.impact = impact;
    }

    @Override
    public double getImpact() {
        return impact;
    }

    public double getFeedBackLevel() {
        return feedBackLevel;
    }
    @Override
    public double getMinAllowedFeedbackLevel() {
        return MIN_ALLOWED_FEEDBACK_LEVEL;
    }

    @Override
    public double getMaxAllowedImpactLevel() {
        return MAX_ALLOWED_IMPACT_LEVEL;
    }

    @Override
    public double getUnacceptableLowLevel() {
        return UNACCEPTABLE_LOW_LEVEL;
    }

    @Override
    public double getUnacceptableHighLevel() {
        return UNACCEPTABLE_HIGH_LEVEL;
    }
    @Override
    public void setFeedBackLevel(double feedBackLevel) {
        if (feedBackLevel > MIN_ALLOWED_FEEDBACK_LEVEL) {
            impact -= feedBackLevel;
            if (impact > MAX_ALLOWED_IMPACT_LEVEL) {
                impact = 0;
                pleasureSatisfaction.setUnpleasureLevel();
            }
            pleasureSatisfaction.setLevel(pleasureSatisfaction.getLevel() + feedBackLevel - this.feedBackLevel);
            this.feedBackLevel = feedBackLevel;
        }
    }
}
