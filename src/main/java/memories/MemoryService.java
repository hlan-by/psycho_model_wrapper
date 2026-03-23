package memories;

import figures.SpecificFigure;
import figures.Figure;
import desires.Desire;
import emotions.key.KeyEmotion;
import percepts.Percept;
import java.util.List;
import java.util.Optional;

public interface MemoryService {

    // Create
    void save(SpecificFigure figure);

    // Read
    Optional<SpecificFigure> getById(String id);

    List<SpecificFigure> findAll();

    // Update
    void update(SpecificFigure figure);

    // Delete
    void delete(String id);

    // Semantic Retrieval
    List<SpecificFigure> findSimilar(SpecificFigure probe, int topK);

    List<SpecificFigure> findByPercept(Percept percept, int topK);

    List<SpecificFigure> findByEmotion(KeyEmotion emotion, int topK);

    List<SpecificFigure> findByDesire(Desire desire, int topK);

    // Hybrid Querying
    List<SpecificFigure> findRelevant(
        Percept percept,
        Desire drive,
        KeyEmotion emotion,
        int topK
    );

    // New method for saving or updating
    void saveOrUpdate(Figure figure);
}
