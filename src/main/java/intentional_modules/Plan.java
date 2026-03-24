package intentional_modules;

import java.util.ArrayList;
import java.util.List;

public class Plan {
    private final List<Action> steps;
    private int currentStepIndex;

    public Plan() {
        this.steps = new ArrayList<>();
        this.currentStepIndex = 0;
    }

    public void addAction(Action action) {
        steps.add(action);
    }
    
    public void addActions(List<Action> actions) {
        if (actions != null) {
            steps.addAll(actions);
        }
    }

    public Action nextAction() {
        if (currentStepIndex < steps.size()) {
            return steps.get(currentStepIndex++);
        }
        return null;
    }

    public boolean isComplete() {
        return currentStepIndex >= steps.size();
    }
    
    public List<Action> getSteps() {
        return steps;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "steps=" + steps +
                ", currentStepIndex=" + currentStepIndex +
                '}';
    }
}
