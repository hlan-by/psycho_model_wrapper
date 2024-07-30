package neuralnetwork;

import emotions.core.Euphoric;
import figures.Figure;

import java.util.Optional;
import java.util.Set;

public class NeuralNetworkSelectFigureByAttension {

    public Figure selectFigure(Set<Figure> figures) {
        // Simulate neural network processing and selection
        // Pick the first figure with an emotion that implements the Euphoric interface

        Optional<Figure> selectedFigure = figures.stream()
                .filter(figure -> isEuphoric(figure.getKeyEmotion()))
                .findFirst();

        return selectedFigure.orElse(null);
    }

    private boolean isEuphoric(Object emotion) {
        return emotion != null && Euphoric.class.isAssignableFrom(emotion.getClass());
    }
}
