package memories;

import emotions.Affect;
import emotions.key.KeyEmotion;
import figures.SpecificFigure;
import percepts.Percept;
import java.util.List;

public class MemoryBenchmark {

    public static void main(String[] args) {
        VectorDatabase vectorDb = new VectorDatabaseImpl();
        MemoryService memoryService = new MemoryServiceImpl(vectorDb);

        System.out.println("Starting Benchmark...");
        long start = System.currentTimeMillis();

        // 1. Bulk Insert
        int n = 1000;
        for (int i = 0; i < n; i++) {
            SpecificFigure f = new SpecificFigure();
            f.setPercept(createMockPercept(i));
            f.setKeyEmotion(createMockEmotion(i));
            f.setAffect(new Affect(0.5, 0.5));
            memoryService.save(f);
        }
        long insertTime = System.currentTimeMillis() - start;
        System.out.println("Inserted " + n + " figures in " + insertTime + "ms");

        // 2. Retrieval
        start = System.currentTimeMillis();
        List<SpecificFigure> results = memoryService.findByEmotion(createMockEmotion(0), 10);
        long searchTime = System.currentTimeMillis() - start;
        System.out.println("Retrieved top 10 similar figures in " + searchTime + "ms");
        
        System.out.println("Benchmark Complete.");
    }

    private static Percept createMockPercept(int seed) {
        return new Percept() {
            @Override
            public double getSignalLevel() {
                return 1.0;
            }
            
            @Override
            public int hashCode() {
                return seed;
            }
        };
    }

    private static KeyEmotion createMockEmotion(int seed) {
        return new KeyEmotion() {
            @Override
            public int hashCode() {
                return seed;
            }
        };
    }
}
