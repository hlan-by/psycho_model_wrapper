# Memory Layer Implementation

## Overview
This package implements the memory subsystem for the psycho-model-wrapper. It provides vector-based storage and semantic retrieval of `SpecificFigure` objects.

## Components

### 1. Data Model (`SpecificFigure`)
The `SpecificFigure` class has been enhanced with:
- `baseEmotion` (CoreEmotion)
- `affect` (Affect)
- `sourceDrive` (Desire)
- `timestamp` (long)
- `activationCount` (int)
- `id` (String)

### 2. Service Interface (`MemoryService`)
Provides CRUD operations and semantic search:
- `save`, `update`, `delete`, `getById`
- `findSimilar` (general similarity)
- `findByPercept`, `findByEmotion`, `findByDesire`
- `findRelevant` (hybrid query)

### 3. Vector Database (`VectorDatabase` & `VectorDatabaseImpl`)
An interface for vector storage operations. A simple in-memory implementation (`VectorDatabaseImpl`) is provided for testing/prototyping.
**Production Note:** Replace `VectorDatabaseImpl` with a real vector DB client (e.g., Pinecone, Milvus, Weaviate) for production use.

### 4. Embedding Strategy (`FigureEmbeddingStrategy`)
Converts a `SpecificFigure` into a float array (vector) for similarity search.
- Dimensions include: Percept (64), Desire (16), Emotion (16), Intentional Value (1).
- Total Dimension: 97

## Usage Example

```java
// Initialize
VectorDatabase vectorDb = new VectorDatabaseImpl();
MemoryService memoryService = new MemoryServiceImpl(vectorDb);

// Create Figure
SpecificFigure figure = new SpecificFigure();
figure.setPercept(myPercept);
figure.setKeyEmotion(myEmotion);
figure.setAffect(new Affect(0.8, 0.5));

// Save
memoryService.save(figure);

// Semantic Search
List<SpecificFigure> results = memoryService.findByEmotion(targetEmotion, 5);
```

## Consistency Rules
The `MemoryServiceImpl` enforces:
1. Every Figure must have a `Percept`.
2. Every Figure must have at least one `Desire` OR `Emotion`.
3. Emotions must be stored with `Affect`.

## Cognitive Behavior
- **Activation:** Accessing a figure (via ID or search) increments its `activationCount`.
- **Timestamp:** Updated on every save/update/access.
- **Intentional Value:** Incrementally boosted on access.
