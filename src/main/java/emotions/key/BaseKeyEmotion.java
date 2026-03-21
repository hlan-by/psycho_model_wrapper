package emotions.key;

import figures.Figure;
import java.util.Arrays;
import java.util.List;

public abstract class BaseKeyEmotion implements KeyEmotion {
    private final List<Figure> figures;

    public BaseKeyEmotion(Figure... figures) {
        this.figures = Arrays.asList(figures);
    }

    @Override
    public Object getIntentionalObject() {
        return figures;
    }
    
    public List<Figure> getFigures() {
        return figures;
    }
}
