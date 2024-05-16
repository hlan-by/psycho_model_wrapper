package urges;

public class RecognitionUrgeBasic implements Urge {
    private double impact;

    public RecognitionUrgeBasic(double impact) {
        this.impact = impact;
    }

    @Override
    public double getImpact() {
        return impact;
    }
}
