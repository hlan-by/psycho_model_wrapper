package desires;

public class ReproductionDesireBasic implements Desire {
    private double impact;

    public ReproductionDesireBasic(double impact) {
        this.impact = impact;
    }

    @Override
    public double getImpact() {
        return impact;
    }
}
