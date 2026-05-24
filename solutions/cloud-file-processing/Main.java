package FileProcessing;

/**
 * Main class demonstrating the Factory Method pattern.
 * 
 * Key points:
 * - Demonstrates decoupling between processing workflow
 *   and concrete processors.
 * - Shows scalability and extensibility.
 * - No conditional logic is required for object creation.
 */
public class Main {

    public static void main(String[] args) {

        // Using Factory Method for CSV processing
        FileProcessingJob csvJob = new CSVProcessingJob();
        csvJob.execute("sales_data.csv");

        // Using Factory Method for JSON processing
        FileProcessingJob jsonJob = new JSONProcessingJob();
        jsonJob.execute("users.json");

        // Using Factory Method for XML processing
        FileProcessingJob xmlJob = new XMLProcessingJob();
        xmlJob.execute("legacy_system.xml");

        // Using Factory Method for Log processing
        FileProcessingJob logJob = new LogProcessingJob();
        logJob.execute("server_logs.log");
    }
}
