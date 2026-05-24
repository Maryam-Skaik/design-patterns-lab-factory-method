package FileProcessing;

/**
 * Concrete Factory for creating LogFileProcessor.
 */
public class LogProcessingJob extends FileProcessingJob {

    @Override
    public FileProcessor createProcessor() {
        return new LogFileProcessor();
    }
}
