package urges;

import java.util.Map;

public class SpecificUrge implements Urge{
    private Map<Class<? extends Urge>, Urge> urges;

    private double impact;

    public SpecificUrge(Map<Class<? extends Urge>, Urge> urges,double impact) {
        this.urges = urges;
        this.impact = impact;

    }

    @Override
    public double getImpact() {
        return impact;
    }
}
