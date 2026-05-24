package FileProcessing;

/**
 * Concrete Factory for creating XMLFileProcessor.
 */
public class XMLProcessingJob extends FileProcessingJob {

    @Override
    public FileProcessor createProcessor() {
        return new XMLFileProcessor();
    }
}
