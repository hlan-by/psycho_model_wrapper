package desires;

import java.util.Map;

public class SpecificDesire implements Desire {
    private Map<Class<? extends Desire>, Desire> desires;

    private double impact;

    public SpecificDesire(Map<Class<? extends Desire>, Desire> desires, double impact) {
        this.desires = desires;
        this.impact = impact;

    }

    @Override
    public double getImpact() {
        return impact;
    }
}
