package FileProcessing;

/**
 * Concrete Factory for creating JSONFileProcessor.
 */
public class JSONProcessingJob extends FileProcessingJob {

    @Override
    public FileProcessor createProcessor() {
        return new JSONFileProcessor();
    }
}
