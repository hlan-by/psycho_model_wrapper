package conscience;

import desires.Desire;
import emotions.Affect;
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

    public Figure process(Percept percept, Desire activeDesire) {
        SpecificFigure figure = new SpecificFigure()
                .setPercept(percept)
                .setSourceDrive(activeDesire);

        // 1. первичная оценка
        double initialValue = estimateValence(percept, activeDesire);
        double initialEnergy = estimateEnergy(percept);

        figure.setAffect(new Affect(initialValue, initialEnergy));

        // 2. оценка удовлетворения позыва
        int satisfaction = estimateSatisfaction(percept, activeDesire);
        figure.setNeedSatisfaction(activeDesire, satisfaction);

        // 3. первичная значимость
        figure.setIntentionalValue(initialValue * initialEnergy);

        return figure;
    }

    private double estimateValence(Percept percept, Desire desire) {
        // Placeholder: Assuming positive valence if desire is active
        return 0.5;
    }

    private double estimateEnergy(Percept percept) {
        // Placeholder: Assuming moderate energy
        return 0.5;
    }

    private int estimateSatisfaction(Percept percept, Desire desire) {
        // Placeholder: Assuming 50% satisfaction
        return 50;
    }
}
