# Assessment 004 - Summative (Java Version)

## 📚 Learning Outcomes Assessed

- Data Structures (Lists, Maps)
- Data Manipulation
- String Formatting
- Loops
- CLI Commands (Conceptual)
- APIs (Conceptual)

---

## 🧩 Assessment Structure

This assessment has **two sections**:

### 1. Coding Assessment (50%)
- Implement required methods in:

Summative.java

- Ensure all **JUnit tests pass**

### 2. Long Questions (50%)
- Answer conceptual questions in:

answers.txt

- Do NOT remove the comments in the file

---

## 🎯 Your Goal

### Coding Section:
- Implement all methods in `Summative.java`
- Ensure:
- Code compiles
- Logic is correct
- All tests pass

### Theory Section:
- Answer all questions in `answers.txt`
- Provide clear explanations and examples

---

## 📁 Project Structure

```text
summative-maven/
├── pom.xml
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── assessment/
│   │               └── Summative.java
│   └── test/
│       └── java/
│           └── com/
│               └── assessment/
│                   └── SummativeTest.java
├── answers.txt
└── README.md
```
## ⚙️ Requirements

- Java 17
- Maven
- Internet connection (for dependencies)

---

## 🚀 How to Run Tests

### ▶ Run all tests:
```bash
mvn test
▶ Run a specific test class:
mvn -Dtest=SummativeTest test
▶ Run a specific test method:
mvn -Dtest=SummativeTest#testBatchApiDispatcherLogic test
🧪 Testing Framework

This project uses:

JUnit 5
Maven Surefire Plugin

Tests are located in:

src/test/java/com/assessment/
📌 Coding Questions Overview
Question 1: batchApiDispatcher
Split a list into batches of max 5 items
Preserve order
No data loss
Question 2: winningStreak
Find longest consecutive "W" in a list
Reset on "L"
Question 3: peakFinder
Find values greater than neighbors
Ignore first and last elements
Question 4: stageSummary
Group by stage
Sum durations

Format as:

"Stage 2" -> 5.5
Question 5: drawTriangle
Generate a hollow triangle
Center aligned
Width = 2 * height - 1

Example:

    *
   * *
  *   *
 *     *
*********
⚠️ Important Notes
Do NOT modify test files
Do NOT change method signatures
Ensure:
No mutation of input data
Correct data structures used
Clean, readable code
💡 Tips
Use ArrayList for dynamic lists
Use HashMap for key-value storage
Use StringBuilder for string construction
Use loops efficiently (for / while)
🏁 Submission Checklist

Before submitting:

✅ All tests pass (mvn test)
✅ Code compiles
✅ answers.txt completed
✅ No unnecessary changes made
📖 Good Luck!

This assessment tests your ability to:

Think logically
Work with data structures
Write clean Java code
Understand real-world scenarios

Stay calm, test often, and debug step-by-step 🚀


---

## 🔥 What This Fix Does

- ✅ Converts Python workflow → **Maven workflow**
- ✅ Uses `mvn test` instead of `pytest`
- ✅ Matches your **exact folder structure**
- ✅ Aligns with your **JUnit + Surefire plugin**
- ✅ Looks **professional for submission**

---

## 🚀 If You Want Next Level

I can also:
- Add **badges / styling (GitHub ready)**
- Generate a **PDF version**
- Help you write a **perfect submission repo**

Just tell me 👍