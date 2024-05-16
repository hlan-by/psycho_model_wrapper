package desires;

public class RecognitionDesireBasic implements Desire {
    private double impact;

    public RecognitionDesireBasic(double impact) {
        this.impact = impact;
    }

    @Override
    public double getImpact() {
        return impact;
    }
}
