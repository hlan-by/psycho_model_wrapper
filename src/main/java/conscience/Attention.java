package conscience;

import desires.Desire;
import emotions.core.CoreEmotion;
import feelings.Feeling;
import feelings.FeelingsMatrix;
import figures.Figure;
import figures.FigureBuilder;
import neuralnetwork.NeuralNetworkSelectFigureByAttension;
import percepts.Percept;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Attention {

    private String focus;
    private NeuralNetworkSelectFigureByAttension neuralNetwork;

    public Attention(String focus, NeuralNetworkSelectFigureByAttension neuralNetwork) {
        this.focus = focus;
        this.neuralNetwork = neuralNetwork;
    }

    public String getFocus() {
        return focus;
    }

    public void setFocus(String focus) {
        this.focus = focus;
    }

    public Feeling getResultingEmotion(CoreEmotion coreEmotion, Set<Figure> figures) {
        for (Figure figure : figures) {
            Class<?> keyEmotion = figure.getKeyEmotion().getClass();
            String resultingEmotionName = FeelingsMatrix.getResultingEmotionInConsumptionDesire(coreEmotion.getClass(), keyEmotion);
            try {
                Class<?> resultingEmotionClass = Class.forName("feelings." + resultingEmotionName);
                return (Feeling) resultingEmotionClass.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public Feeling attachToFigureForEuphoricEmotion(Set<Figure> figures) {
        Figure selectedFigure = neuralNetwork.selectFigure(figures);
        if (selectedFigure != null) {
            Figure existingFigure = selectExistingFigure(figures);
            if (existingFigure != null) {
                Figure newFigure = combineFigures(existingFigure, selectedFigure);
                return getResultingEmotionFromFigure(newFigure);
            }
        }
        return null;
    }

    private Figure selectExistingFigure(Set<Figure> figures) {
        // For simplicity, return the first figure
        return figures.stream().findFirst().orElse(null);
    }

    private Figure combineFigures(Figure figure1, Figure figure2) {
        // Provide default Percept and empty List<Desire> if none are available
        Percept defaultPercept = null;
        List<Desire> emptyDesires = new ArrayList<>();

        FigureBuilder figureBuilder = new FigureBuilder();
        figureBuilder.withFiguresAndCurrentPercept(defaultPercept, emptyDesires, figure1, figure2);
        return figureBuilder.buildSpecificFigure();
    }

    private Feeling getResultingEmotionFromFigure(Figure figure) {
        Class<?> keyEmotion = figure.getKeyEmotion().getClass();
        String resultingEmotionName = FeelingsMatrix.getResultingEmotionInConsumptionDesire(CoreEmotion.class, keyEmotion); // Assuming CoreEmotion is available
        try {
            Class<?> resultingEmotionClass = Class.forName("feelings." + resultingEmotionName);
            return (Feeling) resultingEmotionClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Attention{" +
                "focus='" + focus + '\'' +
                ", neuralNetwork=" + neuralNetwork +
                '}';
    }
}


