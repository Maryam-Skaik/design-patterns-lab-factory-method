package FileProcessing;

/**
 * Optional extension demonstrating Open/Closed Principle.
 * 
 * - New file types can be added without modifying existing code.
 */
public class ImageFileProcessor implements FileProcessor {

    @Override
    public void processFile(String fileName) {
        System.out.println("Processing Image file: " + fileName);
        System.out.println("Applying image optimization and compression...");
    }
}
