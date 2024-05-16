package desires;

public class ExpansionDesireBasic implements Desire {
    private double impact;

    public ExpansionDesireBasic(double impact) {
        this.impact = impact;
    }

    @Override
    public double getImpact() {
        return impact;
    }
}
