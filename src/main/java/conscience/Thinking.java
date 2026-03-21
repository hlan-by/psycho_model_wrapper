package conscience;

import feelings.Feeling;
import figures.Figure;
import figures.SpecificFigure;
import percepts.Percept;

import java.util.List;

public class Thinking {
    private final Attention attention;

    public Thinking(Attention attention) {
        this.attention = attention;
    }

    public Figure process(Percept percept) {
        return new SpecificFigure().setPercept(percept);
    }

    public Figure process(List<Percept> percepts, Feeling previousFeeling) {
        // Simple logic: if previous feeling was negative, try to change focus
        // If positive, reinforce current focus
        // This is a placeholder for actual cognitive logic

        // For now, return a new figure based on percepts
        // In a real implementation, this would involve more complex logic
        if (percepts != null && !percepts.isEmpty()) {
             return new SpecificFigure().setPercept(percepts.get(0));
        }
        return null;
    }
}
