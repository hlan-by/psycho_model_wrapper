package memories;

import desires.Desire;
import emotions.Affect;
import emotions.core.CoreEmotion;
import emotions.key.KeyEmotion;
import figures.SpecificFigure;
import figures.Figure;
import percepts.Percept;

import java.util.*;

public class MemoryServiceImpl implements MemoryService {

    private final VectorDatabase vectorDb;
    private final FigureEmbeddingStrategy embeddingStrategy;

    public MemoryServiceImpl(VectorDatabase vectorDb) {
        this.vectorDb = vectorDb;
        this.embeddingStrategy = new FigureEmbeddingStrategy();
    }

    public MemoryServiceImpl(VectorDatabase vectorDb, FigureEmbeddingStrategy embeddingStrategy) {
        this.vectorDb = vectorDb;
        this.embeddingStrategy = embeddingStrategy;
    }

    @Override
    public void save(SpecificFigure figure) {
        validateFigure(figure);
        if (figure.getId() == null) {
            figure.setId(UUID.randomUUID().toString());
        }
        if (figure.getTimestamp() == 0) {
            figure.setTimestamp(System.currentTimeMillis());
        }
        float[] vector = embeddingStrategy.embed(figure);
        vectorDb.upsert(figure.getId(), vector, figure);
    }

    @Override
    public Optional<SpecificFigure> getById(String id) {
        SpecificFigure figure = vectorDb.get(id);
        if (figure != null) {
            updateAccessStats(figure);
        }
        return Optional.ofNullable(figure);
    }

    @Override
    public List<SpecificFigure> findAll() {
        return vectorDb.getAll();
    }

    @Override
    public void update(SpecificFigure figure) {
        if (figure.getId() == null) {
            throw new IllegalArgumentException("Figure ID cannot be null for update");
        }
        validateFigure(figure);
        updateAccessStats(figure);
        float[] vector = embeddingStrategy.embed(figure);
        vectorDb.upsert(figure.getId(), vector, figure);
    }

    @Override
    public void delete(String id) {
        vectorDb.delete(id);
    }

    @Override
    public List<SpecificFigure> findSimilar(SpecificFigure probe, int topK) {
        float[] vector = embeddingStrategy.embed(probe);
        List<VectorDatabase.SearchResult> results = vectorDb.search(vector, topK);
        
        List<SpecificFigure> figures = new ArrayList<>();
        for (VectorDatabase.SearchResult result : results) {
            SpecificFigure fig = result.figure;
            updateAccessStats(fig);
            figures.add(fig);
        }
        return figures;
    }

    @Override
    public List<SpecificFigure> findByPercept(Percept percept, int topK) {
        SpecificFigure probe = new SpecificFigure();
        probe.setPercept(percept);
        return findSimilar(probe, topK);
    }

    @Override
    public List<SpecificFigure> findByEmotion(KeyEmotion emotion, int topK) {
        SpecificFigure probe = new SpecificFigure();
        probe.setKeyEmotion(emotion);
        return findSimilar(probe, topK);
    }

    @Override
    public List<SpecificFigure> findByDesire(Desire desire, int topK) {
        SpecificFigure probe = new SpecificFigure();
        probe.setDesires(Collections.singletonList(desire));
        return findSimilar(probe, topK);
    }

    @Override
    public List<SpecificFigure> findRelevant(Percept percept, Desire drive, KeyEmotion emotion, int topK) {
        SpecificFigure probe = new SpecificFigure();
        probe.setPercept(percept);
        probe.setSourceDrive(drive);
        probe.setKeyEmotion(emotion);
        return findSimilar(probe, topK);
    }

    private void validateFigure(SpecificFigure figure) {
        if (figure.getPercept() == null) {
            throw new IllegalArgumentException("Figure cannot exist without Percept");
        }
        boolean hasDesire = figure.getDesires() != null && !figure.getDesires().isEmpty();
        boolean hasEmotion = figure.getKeyEmotion() != null || figure.getBaseEmotion() != null;
        
        if (!hasDesire && !hasEmotion) {
            throw new IllegalArgumentException("Figure must have at least one Desire OR Emotion");
        }
        
        if (hasEmotion && figure.getAffect() == null) {
             throw new IllegalArgumentException("Emotions must be stored with Affect/Energy");
        }
    }

    private void updateAccessStats(SpecificFigure figure) {
        figure.setActivationCount(figure.getActivationCount() + 1);
        figure.setTimestamp(System.currentTimeMillis());
        figure.setIntentionalValue(figure.getIntentionalValue() + 0.01);
    }
}
