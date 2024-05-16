package desires;

public class ConsumptionDesireBasic implements Desire {
    private double impact;

    public ConsumptionDesireBasic(double impact) {
        this.impact = impact;
    }

    @Override
    public double getImpact() {
        return impact;
    }
}
