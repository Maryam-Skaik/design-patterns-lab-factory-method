package FileProcessing;

/**
 * Concrete implementation of FileProcessor for JSON files.
 * 
 * Teaching point:
 * - Handles API ingestion processing behavior.
 */
public class JSONFileProcessor implements FileProcessor {

    @Override
    public void processFile(String fileName) {
        System.out.println("Processing JSON file: " + fileName);
        System.out.println("Parsing JSON data for API ingestion...");
    }
}
