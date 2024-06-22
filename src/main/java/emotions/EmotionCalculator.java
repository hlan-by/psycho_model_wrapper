package emotions;

import emotions.core.SupportJoy;
import emotions.key.*;

import java.util.HashMap;
import java.util.Map;

public class EmotionCalculator {

    // Transfer for basic needs
    enum BasicNeed {
        EXPANSION, PROTECTION, RECOGNITION, REPRODUCTION, CONSUMPTION
    }

   /* // Enumeration for emotions
    enum Emotion {
        SURPRISE, SADNESS, PLEASURE, JOY, INTEREST, FEAR, DISGUST, ANGER
    }*/

    // Enumeration for level of need satisfaction
    enum SatisfactionLevel {
        INSUFFICIENT, COMFORTABLE, EXCESSIVE
    }

    // Class for representing a figure
    static class Figure {
        Map<BasicNeed, Integer> needsSatisfaction;
        Map<BasicNeed, SatisfactionLevel> satisfactionLevels;

        Figure() {
            needsSatisfaction = new HashMap<>();
            satisfactionLevels = new HashMap<>();
        }

        void setNeedSatisfaction(BasicNeed need, int value) {
            needsSatisfaction.put(need, value);
        }

        void setSatisfactionLevel(BasicNeed need, SatisfactionLevel level) {
            satisfactionLevels.put(need, level);
        }

        int getNeedSatisfaction(BasicNeed need) {
            return needsSatisfaction.getOrDefault(need, 0);
        }

        SatisfactionLevel getSatisfactionLevel(BasicNeed need) {
            return satisfactionLevels.getOrDefault(need, SatisfactionLevel.COMFORTABLE);
        }
    }

    // Method for calculating emotions
    static KeyEmotion calculateEmotion(Figure figure1, Figure figure2) {
        int totalSatisfaction = 0;
        int totalSatisfactionDifference = 0;

        for (BasicNeed need : BasicNeed.values()) {
            int satisfaction1 = figure1.getNeedSatisfaction(need);
            int satisfaction2 = figure2.getNeedSatisfaction(need);
            totalSatisfaction += satisfaction1 + satisfaction2;

            SatisfactionLevel level1 = figure1.getSatisfactionLevel(need);
            SatisfactionLevel level2 = figure2.getSatisfactionLevel(need);

            // calculate the difference in levels of need satisfaction
            int difference = Math.abs(satisfaction1 - satisfaction2);
            totalSatisfactionDifference += difference;
        }

        double averageSatisfaction = totalSatisfaction / (2.0 * BasicNeed.values().length);
        double averageDifference = totalSatisfactionDifference / (double) BasicNeed.values().length;

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
        for (SatisfactionLevel level : figure.satisfactionLevels.values()) {
            if (level == SatisfactionLevel.EXCESSIVE || level == SatisfactionLevel.INSUFFICIENT) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Example
        Figure figure1 = new Figure();
        figure1.setNeedSatisfaction(BasicNeed.CONSUMPTION, 90);
        figure1.setSatisfactionLevel(BasicNeed.CONSUMPTION, SatisfactionLevel.EXCESSIVE);

        Figure figure2 = new Figure();
        figure2.setNeedSatisfaction(BasicNeed.CONSUMPTION, 20);
        figure2.setSatisfactionLevel(BasicNeed.CONSUMPTION, SatisfactionLevel.COMFORTABLE);

        KeyEmotion emotion = calculateEmotion(figure1, figure2);
        System.out.println("Resulting Emotion: " + emotion);
    }
}
