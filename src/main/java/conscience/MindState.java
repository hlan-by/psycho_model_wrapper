package conscience;

import desires.Desire;
import emotions.Affect;
import feelings.Feeling;
import figures.Figure;

import java.util.List;

public class MindState {
    private final List<Figure> figures;
    private final Feeling currentFeeling;
    private final List<Desire> desires;
    private final Affect totalAffect;
    private final double totalIntentionality;
    private final long timestamp;

    public MindState(List<Figure> figures, Feeling currentFeeling, List<Desire> desires) {
        this.figures = figures;
        this.currentFeeling = currentFeeling;
        this.desires = desires;
        this.timestamp = System.currentTimeMillis();
        
        // Calculate derived metrics
        double sumValue = 0;
        double sumEnergy = 0;
        double sumIntentionality = 0;
        
        if (figures != null) {
            for (Figure f : figures) {
                sumIntentionality += f.getIntentionalValue();
                Affect a = f.getAffect();
                if (a != null) {
                    sumValue += a.getValue();
                    sumEnergy += a.getEnergy();
                }
            }
        }
        
        if (currentFeeling != null && currentFeeling.getAffect() != null) {
            sumValue += currentFeeling.getAffect().getValue();
            sumEnergy += currentFeeling.getAffect().getEnergy();
        }
        
        this.totalAffect = new Affect(sumValue, sumEnergy);
        this.totalIntentionality = sumIntentionality;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    public Feeling getCurrentFeeling() {
        return currentFeeling;
    }

    public List<Desire> getDesires() {
        return desires;
    }

    public Affect getTotalAffect() {
        return totalAffect;
    }

    public double getTotalIntentionality() {
        return totalIntentionality;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
