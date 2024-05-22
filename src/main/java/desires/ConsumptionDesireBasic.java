package desires;

import feelings.Pleasure;

public class ConsumptionDesireBasic implements Desire {
    private final Pleasure pleasure;
    private double impact;
    private double feedBackLevel;
    private double MAX_ALLOWED_IMPACT_LEVEL = 10E19;//todo setup correct value

    public ConsumptionDesireBasic(double impact, Pleasure pleasure) {
        this.impact = impact;
        this.pleasure = pleasure;
    }

    @Override
    public double getImpact() {
        return impact;
    }

    public double getFeedBackLevel() {
        return feedBackLevel;
    }

    @Override
    public void setFeedBackLevel(double feedBackLevel) {
        impact -= feedBackLevel;
        if (impact > MAX_ALLOWED_IMPACT_LEVEL) {
            impact = 0;
            pleasure.setUnpleasureLevel();
        }
        pleasure.setLevel(pleasure.getLevel() + feedBackLevel - this.feedBackLevel);
        this.feedBackLevel = feedBackLevel;
    }
}
