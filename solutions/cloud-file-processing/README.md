# 🧪 Activity: Cloud File Processing System - Solution

## 🎯 Objective

This solution demonstrates designing a scalable and maintainable cloud file processing system using the **Factory Method Pattern** in Java.

The design focuses on separating:

* File processing behavior
* Object creation logic

while ensuring the system remains extensible and easy to maintain.

---

## 🧠 Solution Explanation

### Step 1: Identified Main Components

* `FileProcessor`
* Concrete Processors

  * `CSVFileProcessor`
  * `JSONFileProcessor`
  * `XMLFileProcessor`
  * `LogFileProcessor`
* `FileProcessingJob`
* Concrete Processing Jobs

  * `CSVProcessingJob`
  * `JSONProcessingJob`
  * `XMLProcessingJob`
  * `LogProcessingJob`
* `Main`

---

### Step 2: Defined Factory Method Structure

* `FileProcessor` defines the common processing behavior.
* Each concrete processor implements its own file processing logic.
* `FileProcessingJob` defines:

  * The processing workflow
  * The Factory Method `createProcessor()`
* Concrete processing jobs decide which processor to instantiate.
* `Main` demonstrates how clients use the system without knowing concrete implementations.

---

### Step 3: UML Diagram Representation

```text
+---------------------------------------------------+
|                FileProcessor                      |
+---------------------------------------------------+
| +processFile(fileName: String): void              |
+---------------------------------------------------+
                     ▲
     ---------------------------------------------
     |                 |               |          |
     |                 |               |          |
+----------------+  +-----------------+ +----------------+ +----------------+
| CSVFileProcessor| |JSONFileProcessor| |XMLFileProcessor| |LogFileProcessor|
+----------------+  +-----------------+ +----------------+ +----------------+
| +processFile() |  | +processFile()  | | +processFile() | | +processFile() |
+----------------+  +-----------------+ +----------------+ +----------------+


+---------------------------------------------------+
|               FileProcessingJob                   |
+---------------------------------------------------+
| +createProcessor(): FileProcessor                 |
| +execute(fileName: String): void                  |
+---------------------------------------------------+
                     ▲
     -------------------------------------------------------
     |                    |                  |              |
     |                    |                  |              |
+----------------+ +-----------------+ +----------------+ +----------------+
|CSVProcessingJob| |JSONProcessingJob| |XMLProcessingJob| |LogProcessingJob|
+----------------+ +-----------------+ +----------------+ +----------------+
|+createProcessor| |+createProcessor | |+createProcessor| |+createProcessor|
+----------------+ +-----------------+ +----------------+ +----------------+
```

---

### Step 4: Java Implementation Highlights

* `FileProcessor` provides a common abstraction for all processors.
* Each processor encapsulates its own processing logic independently.
* `FileProcessingJob` centralizes the workflow logic.
* Concrete subclasses decide which processor object gets created.
* The client code never directly instantiates processors.
* No `if/else` or `switch` statements are used for object creation.
* The design follows the **Open/Closed Principle**.

---

### Example Processing Execution

```java
FileProcessingJob csvJob = new CSVProcessingJob();
csvJob.execute("sales_data.csv");

FileProcessingJob jsonJob = new JSONProcessingJob();
jsonJob.execute("users.json");

FileProcessingJob xmlJob = new XMLProcessingJob();
xmlJob.execute("legacy_system.xml");

FileProcessingJob logJob = new LogProcessingJob();
logJob.execute("server_logs.log");
```

---

### Example Console Output

```text
================================
Starting processing job...
Processing CSV file: sales_data.csv
Performing data analysis on CSV data...
Processing completed successfully.
================================

================================
Starting processing job...
Processing JSON file: users.json
Parsing JSON data for API ingestion...
Processing completed successfully.
================================
```

---

## ✅ Key Concepts Demonstrated

* Factory Method Pattern
* Polymorphism
* Inheritance
* Encapsulation
* Separation of Concerns
* Open/Closed Principle (OCP)
* Delegation of Object Creation
* Scalable System Design

---

## 🚀 Advantages of This Design

* Eliminates rigid conditional logic
* Makes the system easy to extend
* Supports adding new file types without modifying existing code
* Improves maintainability and scalability
* Decouples processing workflow from concrete implementations
* Encourages clean architecture and modular design

---

## 🧩 Optional Extension Example

Adding support for a new file type requires only:

1. Creating a new processor class

```java
public class ImageFileProcessor implements FileProcessor {

    @Override
    public void processFile(String fileName) {
        System.out.println("Processing image file: " + fileName);
    }
}
```

2. Creating a new processing job

```java
public class ImageProcessingJob extends FileProcessingJob {

    @Override
    public FileProcessor createProcessor() {
        return new ImageFileProcessor();
    }
}
```

---

## 📌 Key Insight

This activity demonstrates how the **Factory Method Pattern** improves extensibility and maintainability by delegating object creation to subclasses instead of relying on rigid conditional logic.

The result is a cleaner, more scalable, and developer-friendly architecture suitable for real-world backend systems.
