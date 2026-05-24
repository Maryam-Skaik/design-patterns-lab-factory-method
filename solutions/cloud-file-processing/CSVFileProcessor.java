package FileProcessing;

/**
 * Concrete implementation of FileProcessor for CSV files.
 * 
 * - Encapsulates CSV-specific processing behavior.
 * - Can evolve independently without affecting other processors.
 */
public class CSVFileProcessor implements FileProcessor {

    @Override
    public void processFile(String fileName) {
        System.out.println("Processing CSV file: " + fileName);
        System.out.println("Performing data analysis on CSV data...");
    }
}
