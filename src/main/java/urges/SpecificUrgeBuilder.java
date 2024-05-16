package urges;

import java.util.HashMap;
import java.util.Map;

/**
 * Example:
 * SpesificUrge spesificUrge = new SpesificUrgeBuilder()
 * .withUrgeImpact(ConsumptionUrgeBasic.class, 0.1)
 * .withUrgeImpact(ExpansionUrgeBasic.class, 0.2)
 * .withUrgeImpact(ProtectionUrgeBasic.class, 0.3)
 * .withUrgeImpact(RecognitionUrgeBasic.class, 0.4)
 * .withUrgeImpact(ReproductionUrgeBasic.class, 0.5)
 * .build(specificImpact);
 */
public class SpecificUrgeBuilder {
    private Map<Class<? extends Urge>, Double> urgeImpacts = new HashMap<>();

    public SpecificUrgeBuilder withUrgeImpact(Class<? extends Urge> urgeClass, double impact) {
        urgeImpacts.put(urgeClass, impact);
        return this;
    }

    public SpecificUrge build(double impact) {
        Map<Class<? extends Urge>, Urge> urges = new HashMap<>();
        for (Map.Entry<Class<? extends Urge>, Double> entry : urgeImpacts.entrySet()) {
            try {
                Urge urge = entry.getKey().getDeclaredConstructor(double.class).newInstance(entry.getValue());
                urges.put(entry.getKey(), urge);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new SpecificUrge(urges, impact);
    }
}
