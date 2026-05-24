package FileProcessing;

/**
 * Concrete Factory for creating CSVFileProcessor.
 * 
 * - Each subclass creates its own processor type.
 * - New file types require new subclasses only.
 */
public class CSVProcessingJob extends FileProcessingJob {

    @Override
    public FileProcessor createProcessor() {
        return new CSVFileProcessor();
    }
}
