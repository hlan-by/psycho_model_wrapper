package urges;

public class ReproductionUrgeBasic implements Urge {
    private double impact;

    public ReproductionUrgeBasic(double impact) {
        this.impact = impact;
    }

    @Override
    public double getImpact() {
        return impact;
    }
}
