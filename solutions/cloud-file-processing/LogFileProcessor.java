package FileProcessing;

/**
 * Concrete implementation of FileProcessor for Log files.
 * 
 * - Handles monitoring and debugging operations.
 */
public class LogFileProcessor implements FileProcessor {

    @Override
    public void processFile(String fileName) {
        System.out.println("Processing Log file: " + fileName);
        System.out.println("Analyzing logs for system monitoring...");
    }
}
