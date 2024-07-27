package figures.meanings;

import desires.Desire;
import desires.SatisfactionLevel;
import figures.Figure;
import percepts.Percept;

import java.util.List;

// Updated MeaningBuilder class
public class MeaningBuilder {
    private String symbol;
    private Figure referent;
    private Percept percept;
    private List<Desire> desires;

    public MeaningBuilder withSymbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public MeaningBuilder withReferent(Figure referent) {
        this.referent = referent;
        return this;
    }

    public MeaningBuilder withPercept(Percept percept) {
        this.percept = percept;
        return this;
    }

    public MeaningBuilder withDesires(List<Desire> desires) {
        this.desires = desires;
        return this;
    }

    public Meaning build() {
        if (symbol == null || referent == null) {
            throw new IllegalStateException("Both symbol and referent must be set");
        }
        Meaning meaning = new Meaning(symbol, referent);
        meaning.setPercept(percept);
        if (desires != null) {
            for (Desire desire : desires) {
                meaning.setSatisfactionLevel(desire, SatisfactionLevel.COMFORTABLE);
            }
        }
        return meaning;
    }
}
