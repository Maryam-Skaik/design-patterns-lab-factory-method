# 🏭 Design Patterns Lab — Factory Method Pattern

![Java](https://img.shields.io/badge/Language-Java-blue) ![Pattern](https://img.shields.io/badge/Pattern-Factory%20Method-green) ![Level](https://img.shields.io/badge/Level-Intermediate-orange) ![Focus](https://img.shields.io/badge/Focus-Scalable%20Design%20%26%20OCP-purple)

---

## 🎥 Lecture Video

This repository accompanies the lecture explaining the **Factory Method Pattern** through a **real backend problem, step-by-step design evolution, and practical implementation**.

▶️ Watch on YouTube:  

[Lecture Video](https://youtu.be/PdmbBfw5mdg)

---

## 📌 About This Repository

This repository provides a **deep and structured understanding of the Factory Method Pattern**.

The focus is not only on *what the pattern is*, but on:

- Understanding the **real problem behind object creation**
- Recognizing **bad design decisions**
- Learning **how systems break as they scale**
- Applying Factory Method to build **extensible and maintainable backend systems**

---

## 🧠 Why Do We Need Factory Method?

In real backend systems, object creation is not static.

You often deal with:
- Multiple types of objects
- Dynamic behavior depending on context
- Continuous system evolution

### ❌ The Core Problem

Developers often:
- Use direct object creation
- Add conditional logic to decide types

This leads to:

- Tight coupling between classes  
- Repeated conditional logic  
- Difficult extension when adding new types  

---

## ⚠️ The Real Pain (From Industry Perspective)

As systems grow:

- New types are added frequently  
- Existing code must be modified repeatedly  
- Bugs are introduced into stable code  
- Code becomes harder to test and maintain  

### Key Insight

The real issue is not creating objects —  
it is **where and how object creation is handled**.

---

## 💡 Running Example: Notification System

### 🎯 Scenario

A backend system is responsible for sending notifications.

Initially:
- Only Email notifications are required

Over time:
- SMS notifications are added  
- Push notifications are introduced  
- Future types (e.g., WhatsApp, WebSocket) are expected  

---

## ❌ Initial Design Problem

The system uses conditional logic to decide which notification to create.

### What Goes Wrong?

- The service class knows all notification types  
- Adding a new type requires modifying existing code  
- The method becomes longer and more complex over time  

### Result

- Violates **Open/Closed Principle**  
- Hard to maintain  
- High risk of breaking existing functionality  

---

## 🧱 Attempted Solution: Simple Factory

### Idea

Centralize object creation in one class.

### Why It Looks Correct

- Removes duplication  
- Cleans client code  
- Encapsulates creation logic  

### ❌ Why It Fails

- Still depends on conditional logic  
- Must be modified for every new type  
- Becomes a **God Class**  
- Violates Open/Closed Principle  

### Key Insight

> The problem was reduced, but not solved.  
> We replaced scattered modification with centralized modification.

---

## 📐 Open/Closed Principle (OCP)

### Definition

Software entities should be:

- **Open for extension** → new functionality can be added  
- **Closed for modification** → existing code should not change  

### Why It Matters

- Reduces risk of introducing bugs  
- Keeps stable code untouched  
- Enables safe system evolution  

---

## ✅ Factory Method — Core Idea

The Factory Method Pattern solves this by:

- Delegating object creation to subclasses  
- Removing conditional logic from central classes  
- Allowing new types to be added without modifying existing code  

### Simple Definition

A Factory Method is:

> A method that allows subclasses to decide which object to create.

---

## 🧩 Structure of Factory Method

### 1. Product

Defines a common interface for all objects.

### 2. Concrete Products

Different implementations of the product.

### 3. Creator

Abstract class that:
- Defines the factory method  
- Contains core workflow logic  

### 4. Factory Method

Abstract method responsible for object creation.

### 5. Concrete Creators

Subclasses that:
- Override the factory method  
- Decide which object to instantiate  

---

## 🔄 How the Design Evolves

### Step 1: Naive Design
- Direct object creation  
- Conditional logic everywhere  

### Step 2: Simple Factory
- Centralized creation  
- Still uses conditional logic  

### Step 3: Factory Method
- Creation delegated to subclasses  
- No conditional logic  
- Fully extensible  

---

## ⚙️ Execution Flow (Conceptual)

1. Client selects a specific creator  
2. Creator executes business logic  
3. Factory method is invoked  
4. Correct product is created  
5. Product performs its behavior  

### Key Concept

Behavior is determined **at runtime using polymorphism**, not conditional logic.

---

## 🚀 Scalability Advantage

When adding a new notification type:

- No existing class is modified  
- Only a new product and creator are added  

### Result

- System remains stable  
- Codebase grows cleanly  
- No risk to existing functionality  

---

## 🆚 Factory vs Factory Method

| Aspect | Simple Factory | Factory Method |
|--------|----------------|----------------|
| Object creation | Centralized | Delegated |
| Conditional logic | Required | Eliminated |
| Open/Closed Principle | Violated | Respected |
| Scalability | Limited | High |

### Key Difference

Factory Method replaces **decision logic** with **polymorphism**.

---

## 🧪 Activity: Cloud File Processing System

### 🎯 Scenario

A cloud platform processes uploaded files in formats such as:

- CSV  
- JSON  
- XML  
- Log files  

Each format requires different processing logic.

### Design Challenge

- New file types will be added over time  
- System must remain scalable  
- Existing processing logic must not be modified  

### Learning Objective

Design a system where:

- Object creation is delegated  
- New types can be added easily  
- Code remains clean and maintainable  

---

## ⚖️ When to Use Factory Method

Use this pattern when:

- System supports multiple object types  
- New types are expected in the future  
- You want to avoid conditional logic  
- You want to follow Open/Closed Principle  

---

## 🚫 When NOT to Use It

Avoid Factory Method when:

- System has very few object types  
- No future extension is expected  
- Simpler solutions are sufficient  

---

## 🧠 Best Practices

- Keep product interfaces simple and clear  
- Avoid mixing creation logic with business logic  
- Use meaningful subclass names  
- Do not reintroduce conditional logic in subclasses  
- Combine with other patterns when needed  

---

## 🎯 Learning Outcomes

After completing this repository, you should be able to:

- Identify poor object creation design  
- Understand the limitations of simple factories  
- Apply Factory Method correctly  
- Design scalable and maintainable backend systems  
- Follow the Open/Closed Principle in real scenarios  

---

## 🚀 How to Use This Repository

1. Clone the repository  
2. Study the example step-by-step  
3. Understand the design evolution  
4. Complete the activity independently  
5. Refactor your solution to improve design  

---

## 🤝 Contribution

Students are encouraged to:

- Extend the system with new types  
- Refactor and improve design  
- Explore alternative implementations  
- Submit improvements and enhancements  

---

## 📌 Final Insight

The Factory Method Pattern is not about avoiding object creation.

It is about:

- Designing for **change**  
- Enabling **safe extension**  
- Building **scalable systems**  

A well-designed system should allow new functionality  
**without modifying what already works**.
