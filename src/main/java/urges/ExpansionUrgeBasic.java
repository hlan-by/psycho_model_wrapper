package urges;

public class ExpansionUrgeBasic implements Urge {
    private double impact;

    public ExpansionUrgeBasic(double impact) {
        this.impact = impact;
    }

    @Override
    public double getImpact() {
        return impact;
    }
}
