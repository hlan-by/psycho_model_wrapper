package figures;

import desires.Desire;
import desires.SatisfactionLevel;
import emotions.Affect;
import emotions.core.CoreEmotion;
import emotions.key.KeyEmotion;
import intentional_modules.Action;
import intentional_modules.Plan;
import percepts.Percept;

import java.util.Map;

public interface Figure {
    Percept getPercept();

    Map<Desire, SatisfactionLevel> getSatisfactionLevels();
    int getNeedSatisfaction(Desire need);
    void setNeedSatisfaction(Desire need, int value);
    void setSatisfactionLevel(Desire need, SatisfactionLevel level);
    SatisfactionLevel getSatisfactionLevel(Desire need);

    KeyEmotion getKeyEmotion();
    
    // New methods for refactoring
    double getIntentionalValue();
    void setIntentionalValue(double value);
    
    Affect getAffect();
    Figure setAffect(Affect affect);
    
    Desire getSourceDrive();
    Figure setSourceDrive(Desire sourceDrive);
    
    CoreEmotion getBaseEmotion();
    Figure setBaseEmotion(CoreEmotion baseEmotion);
    
    long getTimestamp();
    Figure setTimestamp(long timestamp);
    
    int getActivationCount();
    Figure setActivationCount(int count);

    // Behavioral Context
    Plan getLastPlan();
    Figure setLastPlan(Plan plan);

    Action getLastAction();
    Figure setLastAction(Action action);
    
    // Drive Feedback
    Map<Desire, Double> getDriveWeights();
    Map<Desire, Double> getLastDriveImpact();
    Figure setLastDriveImpact(Map<Desire, Double> impact);
}
