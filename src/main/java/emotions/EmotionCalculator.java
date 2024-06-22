package emotions;

import desires.ConsumptionDesireBasic;
import desires.Desire;
import desires.ExpansionDesireBasic;
import desires.ProtectionDesireBasic;
import desires.RecognitionDesireBasic;
import desires.ReproductionDesireBasic;
import emotions.key.AngerI;
import emotions.key.DisgustI;
import emotions.key.FearI;
import emotions.key.InterestI;
import emotions.key.JoyI;
import emotions.key.KeyEmotion;
import emotions.key.PleasureI;
import emotions.key.SadnessI;
import emotions.key.SurpriseI;
import figures.Figure;
import figures.SpecificFigure;

import java.util.Arrays;
import java.util.List;

public class EmotionCalculator {

    // Method for calculating emotions
    static KeyEmotion calculateEmotion(Figure figure1, Figure figure2) {
        List<Desire> desires = Arrays.asList(new ExpansionDesireBasic(), new ProtectionDesireBasic(), new RecognitionDesireBasic()
                , new ConsumptionDesireBasic(), new ReproductionDesireBasic());
        int totalSatisfaction = 0;
        int totalSatisfactionDifference = 0;
        for (Desire need : desires) {
            int satisfaction1 = figure1.getNeedSatisfaction(need);
            int satisfaction2 = figure2.getNeedSatisfaction(need);
            totalSatisfaction += satisfaction1 + satisfaction2;

            SatisfactionLevel level1 = figure1.getSatisfactionLevel(need);
            SatisfactionLevel level2 = figure2.getSatisfactionLevel(need);

            // calculate the difference in levels of need satisfaction
            int difference = Math.abs(satisfaction1 - satisfaction2);
            totalSatisfactionDifference += difference;
        }

        double averageSatisfaction = totalSatisfaction / (2.0 * desires.size());
        double averageDifference = totalSatisfactionDifference / (double) desires.size();

        if (averageSatisfaction > 75) {
            if (averageDifference < 20) {
                return new JoyI();
            } else {
                return new PleasureI();
            }
        } else if (averageSatisfaction < 25) {
            if (averageDifference > 50) {
                return new FearI();
            } else {
                return new SadnessI();
            }
        } else {
            if (averageDifference > 50) {
                return new AngerI();
            } else if (averageDifference > 20) {
                return new SurpriseI();
            } else {
                if (containsExcessiveOrInsufficient(figure1) || containsExcessiveOrInsufficient(figure2)) {
                    return new DisgustI();
                }
                return new InterestI();
            }
        }
    }

    // Method for checking for over- or under-satisfaction of needs
    private static boolean containsExcessiveOrInsufficient(Figure figure) {
        for (SatisfactionLevel level : figure.getSatisfactionLevels().values()) {
            if (level == SatisfactionLevel.EXCESSIVE || level == SatisfactionLevel.INSUFFICIENT) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Example
        Desire expansion = new ExpansionDesireBasic();
        Desire consumptionDesireBasic = new ConsumptionDesireBasic();
        Figure figure1 = new SpecificFigure();
        figure1.setNeedSatisfaction(expansion, 90);
        figure1.setSatisfactionLevel(expansion, SatisfactionLevel.EXCESSIVE);

        Figure figure2 = new SpecificFigure();
        figure2.setNeedSatisfaction(consumptionDesireBasic, 20);
        figure2.setSatisfactionLevel(consumptionDesireBasic, SatisfactionLevel.COMFORTABLE);

        KeyEmotion emotion = calculateEmotion(figure1, figure2);
        System.out.println("Resulting Emotion: " + emotion);
    }
}
