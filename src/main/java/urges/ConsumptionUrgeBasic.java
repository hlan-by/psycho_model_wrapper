package urges;

public class ConsumptionUrgeBasic implements Urge {
    private double impact;

    public ConsumptionUrgeBasic(double impact) {
        this.impact = impact;
    }

    @Override
    public double getImpact() {
        return impact;
    }
}
