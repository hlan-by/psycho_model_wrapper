package urges;

public class ProtectionUrgeBasic implements Urge {
    private double impact;

    public ProtectionUrgeBasic(double impact) {
        this.impact = impact;
    }

    @Override
    public double getImpact() {
        return impact;
    }
}
