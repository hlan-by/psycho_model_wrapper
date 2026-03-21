package memories;

import figures.SpecificFigure;
import java.util.List;

public interface VectorDatabase {
    void upsert(String id, float[] vector, SpecificFigure metadata);
    List<SearchResult> search(float[] queryVector, int topK);
    void delete(String id);
    SpecificFigure get(String id);
    List<SpecificFigure> getAll();

    class SearchResult {
        public final String id;
        public final SpecificFigure figure;
        public final double score;

        public SearchResult(String id, SpecificFigure figure, double score) {
            this.id = id;
            this.figure = figure;
            this.score = score;
        }
    }
}
