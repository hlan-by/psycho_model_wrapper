package intentional_modules;

import desires.Desire;
import java.util.Collections;
import java.util.Map;

public class ActionResult {
    private final double successDelta;
    private final String feedback;
    private final Map<Desire, Double> driveModifiers;

    public ActionResult(double successDelta, String feedback) {
        this(successDelta, feedback, Collections.emptyMap());
    }

    public ActionResult(double successDelta, String feedback, Map<Desire, Double> driveModifiers) {
        this.successDelta = successDelta;
        this.feedback = feedback;
        this.driveModifiers = driveModifiers != null ? driveModifiers : Collections.emptyMap();
    }

    public double getSuccessDelta() {
        return successDelta;
    }

    public String getFeedback() {
        return feedback;
    }
    
    public Map<Desire, Double> getDriveModifiers() {
        return driveModifiers;
    }
}
