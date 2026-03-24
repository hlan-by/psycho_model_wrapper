package intentional_modules;

import desires.Desire;
import figures.Figure;

public class Goal {
    private final Figure target;
    private final Desire desire;
    private final GoalType type;
    private final double desiredDelta;

    public Goal(Figure target, Desire desire, GoalType type, double desiredDelta) {
        this.target = target;
        this.desire = desire;
        this.type = type;
        this.desiredDelta = desiredDelta;
    }

    public Figure getTarget() {
        return target;
    }

    public Desire getDesire() {
        return desire;
    }

    public GoalType getType() {
        return type;
    }

    public double getDesiredDelta() {
        return desiredDelta;
    }

    @Override
    public String toString() {
        return "Goal{" +
                "type=" + type +
                ", target=" + target +
                ", desire=" + desire +
                '}';
    }
}
