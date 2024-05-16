package desires;

import java.util.HashMap;
import java.util.Map;

/**
 * Example:
 * SpesificDesire spesificDesire = new SpesificDesireBuilder()
 * .withDesireImpact(ConsumptionDesireBasic.class, 0.1)
 * .withDesireImpact(ExpansionDesireBasic.class, 0.2)
 * .withDesireImpact(ProtectionDesireBasic.class, 0.3)
 * .withDesireImpact(RecognitionDesireBasic.class, 0.4)
 * .withDesireImpact(ReproductionDesireBasic.class, 0.5)
 * .build(specificImpact);
 */
public class SpecificDesireBuilder {
    private Map<Class<? extends Desire>, Double> desireImpacts = new HashMap<>();

    public SpecificDesireBuilder withDesireImpact(Class<? extends Desire> desireClass, double impact) {
        desireImpacts.put(desireClass, impact);
        return this;
    }

    public SpecificDesire build(double impact) {
        Map<Class<? extends Desire>, Desire> desires = new HashMap<>();
        for (Map.Entry<Class<? extends Desire>, Double> entry : desireImpacts.entrySet()) {
            try {
                Desire desire = entry.getKey().getDeclaredConstructor(double.class).newInstance(entry.getValue());
                desires.put(entry.getKey(), desire);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new SpecificDesire(desires, impact);
    }
}
