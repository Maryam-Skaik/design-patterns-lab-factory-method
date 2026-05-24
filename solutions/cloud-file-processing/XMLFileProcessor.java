package FileProcessing;

/**
 * Concrete implementation of FileProcessor for XML files.
 * 
 * - Handles legacy system integration behavior.
 */
public class XMLFileProcessor implements FileProcessor {

    @Override
    public void processFile(String fileName) {
        System.out.println("Processing XML file: " + fileName);
        System.out.println("Integrating XML data with legacy systems...");
    }
}
