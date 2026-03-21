package memories;

import figures.SpecificFigure;
import java.util.*;

// Simple in-memory mock of a Vector Database for demonstration purposes.
public class VectorDatabaseImpl implements VectorDatabase {
    private final Map<String, SpecificFigure> storage = new HashMap<>();
    private final Map<String, float[]> embeddings = new HashMap<>();

    @Override
    public void upsert(String id, float[] vector, SpecificFigure metadata) {
        storage.put(id, metadata);
        embeddings.put(id, vector);
    }

    @Override
    public List<SearchResult> search(float[] queryVector, int topK) {
        // Linear scan for simplicity (O(N)) - Replace with FAISS/Annoy in production
        List<SearchResult> results = new ArrayList<>();

        for (Map.Entry<String, float[]> entry : embeddings.entrySet()) {
            double score = cosineSimilarity(queryVector, entry.getValue());
            results.add(new SearchResult(entry.getKey(), storage.get(entry.getKey()), score));
        }

        results.sort((a, b) -> Double.compare(b.score, a.score));

        if (results.size() > topK) {
            return results.subList(0, topK);
        }
        return results;
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
        embeddings.remove(id);
    }

    @Override
    public SpecificFigure get(String id) {
        return storage.get(id);
    }

    @Override
    public List<SpecificFigure> getAll() {
        return new ArrayList<>(storage.values());
    }

    private double cosineSimilarity(float[] vectorA, float[] vectorB) {
        double dotProduct = 0.0;
        double normA = 0.0;
        double normB = 0.0;
        for (int i = 0; i < vectorA.length; i++) {
            dotProduct += vectorA[i] * vectorB[i];
            normA += Math.pow(vectorA[i], 2);
            normB += Math.pow(vectorB[i], 2);
        }
        return dotProduct / (Math.sqrt(normA) * Math.sqrt(normB));
    }
}
