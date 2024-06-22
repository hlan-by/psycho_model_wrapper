package conscience;

import desires.Desire;
import emotions.EmotionCalculator;
import emotions.EmotionReceiver;
import emotions.core.CoreEmotion;
import emotions.key.KeyEmotion;
import feelings.Feeling;
import feelings.SpecificFeeling;
import figures.Figure;
import intentional_modules.IntentionalModule;
import percepts.Percept;

/**Percept 1, which is one of the factors in the emergence of the foundational emotion Emotion 1, caused by Urge 1 and
 * associated with the intentional module Module 1, was united by attention into a single figure with Percept 2 (formed
 * by perception or thinking), associated with the intentional module Module 2. As a result, the key emotion Emotion 2 emerged,
 * also caused by the initiating Urge 1. The presence of two affects from the elements of the figure leads to their alignment,
 * which is subjectively perceived as a feeling: thus, Urge 1, activated by Percept 1, connects with Percept 2, cross-assigning
 * significance from Percept 1 to Percept 2. This forms a connection complex in the excitome: "Urge 1-(Module 1 (Emotion 1),
 * Module 2 (Emotion 2))*feeling - Percept 1, Percept 2." As a result, in addition to indexing the significances of
 * Modules 1 and 2 by Urge 1, new connections "Percept 1-Module 2" and "Percept 2-Module 1" are formed, cross-linking
 * the percepts through the intentional: regarding one Urge 1, the significance of Percept 1 has the same nature as the
 * significance of Percept 2, and therefore, they can serve as values for each other, symbolize, and denote each other.
 * For example, a person's personal item acts as a sign of that person for us, or an angry grimace indicates aggression.
 * An association arises, which can be weakly conscious, playing its role in the formation of unclear preferences of
 * a person and later becoming conscious, or clearly conscious and recognized as a logical connection.*/
public class PsychologicalModel {

    private final Attention attention;
    private Percept percept1;
    private Percept percept2;
    private CoreEmotion emotion1;
    private KeyEmotion emotion2;
    private Desire desire;
    private IntentionalModule module1;
    private IntentionalModule module2;
    private Feeling feeling;


    public PsychologicalModel(Percept percept1, Percept percept2, Desire desire, Attention attention) {
        this.attention = attention;
        this.percept1 = percept1;
        this.percept2 = percept2;
        this.desire = desire;
        this.module1 = new IntentionalModule();
        this.module2 = new IntentionalModule();
        processPercepts();
    }

    private void processPercepts() {
        // Generate core emotion based on percepts and urge
        this.emotion1 = new EmotionReceiver(percept1, desire);
        // Combine percept1 and percept2 to a new Figure
       Figure figure = combinePercepts(percept1, percept2);

        // Generate key emotions based on percepts and urge
       //todo this.emotion2 = new EmotionCalculator(percept2, desire);

        // Create feeling based on combined emotions
        this.feeling = new SpecificFeeling().setBasicEmotion(emotion1).setKeyEmotion(emotion2);

        // Create connections between percepts and modules
        createConnections();
    }

    private Figure combinePercepts(Percept... percept) {
        return attention.combinePerceptsToFigure(percept);
    }

    private void createConnections() {
        // Logic to create connections between percepts and intentional modules
        module1.associatePercept(percept1);
        module2.associatePercept(percept2);

      //todo  module1.associateEmotion(emotion1);
      //todo  module2.associateEmotion(emotion2);

        // Cross-assign significance between percepts
        module1.associatePercept(percept2);
        module2.associatePercept(percept1);

        System.out.println("Creating connections between modules and percepts.");
    }

    public Feeling getFeeling() {
        return feeling;
    }

    public static void main(String[] args) {
       // Percept percept1 = new Percept("Percept 1");
       // Percept percept2 = new Percept("Percept 2");
      //  Desire urge1 = new ConsumptionDesireBasic("Urge 1");

      //  PsychologicalModel model = new PsychologicalModel(percept1, percept2, urge1);
      //  Feeling resultingFeeling = model.getFeeling();

      //  System.out.println("Resulting feeling: " + resultingFeeling);
    }
}