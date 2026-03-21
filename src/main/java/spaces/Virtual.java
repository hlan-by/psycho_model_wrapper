package spaces;

import figures.SpecificFigure;
import java.util.List;

/**
 * Represents the virtual (memory) space.
 * Acts as a source of figures retrieved from memory.
 */
public interface Virtual {
    List<SpecificFigure> getRememberedFigures();
}
