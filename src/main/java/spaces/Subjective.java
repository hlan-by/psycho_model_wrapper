package spaces;

import figures.SpecificFigure;
import percepts.Percept;
import java.util.List;

/**
 * Represents the subjective experience of the agent.
 * Combines objective percepts and virtual memories.
 */
public interface Subjective {
    List<Percept> getCurrentPercepts();
    List<SpecificFigure> getCurrentFigures();
    
    // Additional subjective state could go here
    void perceive(Objective objective);
    void recall(Virtual virtual);
}
