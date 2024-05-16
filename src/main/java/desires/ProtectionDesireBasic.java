package desires;

public class ProtectionDesireBasic implements Desire {
    private double impact;

    public ProtectionDesireBasic(double impact) {
        this.impact = impact;
    }

    @Override
    public double getImpact() {
        return impact;
    }
}
