package figures;

import desires.Desire;
import emotions.SatisfactionLevel;

import java.util.Map;

public interface Figure {
    Map<Desire, SatisfactionLevel> getSatisfactionLevels();
    int getNeedSatisfaction(Desire need);
    void setNeedSatisfaction(Desire need, int value);
    void setSatisfactionLevel(Desire need, SatisfactionLevel level);
    SatisfactionLevel getSatisfactionLevel(Desire need);
}
