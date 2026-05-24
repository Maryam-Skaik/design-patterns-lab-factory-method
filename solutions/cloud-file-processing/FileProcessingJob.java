package FileProcessing;

/**
 * Abstract Factory class for file processing jobs.
 * 
 * Key points:
 * - Defines the Factory Method createProcessor().
 * - Subclasses decide which concrete processor to instantiate.
 * - Encapsulates the processing workflow.
 * - Supports Open/Closed Principle.
 */
public abstract class FileProcessingJob {

    // Factory Method
    public abstract FileProcessor createProcessor();

    // Common workflow
    public void execute(String fileName) {

        System.out.println("\n================================");
        System.out.println("Starting processing job...");
        
        FileProcessor processor = createProcessor();

        processor.processFile(fileName);

        System.out.println("Processing completed successfully.");
        System.out.println("================================");
    }
}
