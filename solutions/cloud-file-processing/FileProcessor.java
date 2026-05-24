package FileProcessing;

/**
 * FileProcessor interface defines the common behavior
 * for all file processing types.
 * 
 * Key teaching point:
 * - Factory Method works with this abstraction polymorphically.
 * - Clients depend on this interface, not concrete processors.
 */
public interface FileProcessor {

    void processFile(String fileName);
}
