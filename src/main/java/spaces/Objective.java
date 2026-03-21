package spaces;

import percepts.Percept;
import java.util.List;

/**
 * Represents the objective reality external to the agent.
 * Acts as a source of raw percepts.
 */
public interface Objective {
    List<Percept> getPercepts();
}
