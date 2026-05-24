package FileProcessing;

/**
 * Concrete Factory for creating ImageFileProcessor.
 */
public class ImageProcessingJob extends FileProcessingJob {

    @Override
    public FileProcessor createProcessor() {
        return new ImageFileProcessor();
    }
}
