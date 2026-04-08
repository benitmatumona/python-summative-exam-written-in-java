# Assessment 004 - Summative (Java Version)

---

## 📚 Learning Outcomes Assessed

This assessment evaluates your understanding of:

- Data Structures (Lists, Maps)
- Data Manipulation
- String Formatting
- Loops
- CLI Commands (Conceptual)
- APIs (Conceptual)

---

## 🧩 Assessment Structure

This assessment contains **two sections**:

### 1️⃣ Coding Assessment (50%)

You must implement the required methods inside:

```
Summative.java
```

Your code must:

- Compile successfully
- Follow the provided method signatures
- Pass **all JUnit tests**

---

### 2️⃣ Long Questions (50%)

You must answer conceptual questions inside:

```
answers.txt
```

⚠️ Rules:

- Do **NOT remove the comments**
- Write your answers **below each question**
- Use **clear explanations and examples**

---

## 🎯 Your Goal

### 💻 Coding Section

Implement all methods in:

```
Summative.java
```

Ensure:

- Code compiles
- Logic works correctly
- **All 191 tests pass**

---

### 🧠 Theory Section

Complete all questions in:

```
answers.txt
```

Provide **clear and structured explanations**.

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
├── loadshedding.json
└── README.md
```

---

## ⚙️ Requirements

You must have the following installed:

- ☕ **Java 17**
- 📦 **Maven**
- 🌐 Internet connection (to download dependencies)

---

## 🚀 How to Run Tests

### ▶ Run all tests

```bash
mvn test
```

---

### ▶ Run a specific test class

```bash
mvn -Dtest=SummativeTest test
```

---

### ▶ Run a specific test method

```bash
mvn -Dtest=SummativeTest#testBatchApiDispatcherLogic test
```

---

## 🧪 Testing Framework

This project uses:

- **JUnit 5**
- **Maven Surefire Plugin**

All tests are located in:

```
src/test/java/com/assessment/
```

Your goal is to make **all tests pass successfully**.

---

# 📌 Coding Questions Overview

---

## 1️⃣ Question 1 — `batchApiDispatcher`

The **South African Social Security Agency (SASSA)** needs to send SMS notifications to citizens.

However, the SMS gateway has a strict rule:

⚠️ **Maximum 5 users per request**

Your job is to **split a list of user IDs into batches of 5**.

### Example Input

```
["ID1","ID2","ID3","ID4","ID5","ID6","ID7"]
```

### Expected Output

```
[
 ["ID1","ID2","ID3","ID4","ID5"],
 ["ID6","ID7"]
]
```

### Rules

- Maximum **5 IDs per batch**
- Maintain **original order**
- **Do not lose data**
- **Do not modify the original list**

---

## 2️⃣ Question 2 — `winningStreak`

The **Springboks rugby team** is on tour.

Match results are recorded as:

```
"W" → Win
"L" → Loss
```

Your task is to determine the **longest consecutive sequence of wins**.

### Example Input

```
["W","L","W","W","L","W","W","W"]
```

### Expected Output

```
3
```

Because the longest streak of `"W"` is **3 in a row**.

---

## 3️⃣ Question 3 — `peakFinder`

The **South African Weather Service (SAWS)** is monitoring temperature spikes.

A **local peak** occurs when a temperature is:

- greater than the value **before it**
- greater than the value **after it**

### Example Input

```
[30,32,31,35,33,36,34]
```

### Expected Output

```
[32,35,36]
```

### Rules

- Ignore **first and last elements**
- A peak must be **strictly greater than neighbours**
- Return peaks **in the same order**

---

## 4️⃣ Question 4 — `stageSummary`

Eskom recorded loadshedding incidents across South Africa.

Each record contains information like:

- stage
- duration_hours
- area
- municipality
- province

Your function only needs:

```
stage
duration_hours
```

You must calculate **total hours per stage**.

### Example Input

```
[
 {stage:2, duration_hours:2.5},
 {stage:4, duration_hours:4.0}
]
```

### Expected Output

```
{
 "Stage 2": 2.5,
 "Stage 4": 4.0
}
```

### Rules

- Sum `duration_hours` per stage
- Format keys like:

```
"Stage 2"
```

- Round totals to **2 decimal places**
- Return **empty Map if no records**

---

## 5️⃣ Question 5 — `drawTriangle`

The **Drakensberg Hiking Club** needs a terminal badge generator.

The badge is a **hollow triangle made from `*` characters**.

### Rules

- Triangle must be **centered**
- First row → **1 star**
- Middle rows → **2 stars**
- Last row → **solid stars**
- Width =

```
2 * height - 1
```

---

### Example

Height:

```
5
```

Triangle:

```
    *
   * *
  *   *
 *     *
*********
```

Return:

```
[
"    *",
"   * *",
"  *   *",
" *     *",
"*********"
]
```

Trailing spaces are **not required**.

---

# 📝 Long Format Questions

Answer these questions inside:

```
answers.txt
```

---

## 🖥️ Question 1 — Linux Navigation & File Management

You are working on a **Linux server in Sandton**.

Complete the following tasks:

1. List files and folders
2. Move into folder `config`
3. Read contents of `settings.conf`
4. Create folder `backup`
5. Copy `settings.conf` into `backup`
6. Delete `server.log`

Explain:

- The commands used
- What each command does
- Any potential risks

---

## 🔁 Question 2 — Loops

Explain loops to a **junior developer**.

Your answer should include:

- What loops are
- Types of loops
- When to use each
- Real programming examples

---

## 🔒 Question 3 — Immutable Data Types

Explain **immutable data types in Python**.

Include:

- What immutable means
- Examples of immutable types
- Difference between mutable and immutable
- What happens when modification is attempted

---

## 🌐 Question 4 — APIs and HTTP

Explain APIs to a **non-technical product manager**.

Include:

- What an API is
- How HTTP works
- Types of HTTP requests
- What endpoints are
- How mobile apps communicate with servers

---

# ⚠️ Important Rules

❌ Do **NOT modify test files**

```
SummativeTest.java
```

Only modify:

```
Summative.java
answers.txt
```

---

# 💡 Tips

- Use **ArrayList** for lists
- Use **HashMap** for key-value storage
- Use **StringBuilder** for building strings
- Use loops carefully

---

# 🏁 Submission Checklist

Before submitting:

✅ All tests pass (`mvn test`)  
✅ Code compiles  
✅ `answers.txt` completed  
✅ No test files modified

---

# 📖 Good Luck!

This assessment tests your ability to:

- Think logically
- Work with data structures
- Write clean Java code
- Solve real-world problems

Stay calm, test often, and debug step-by-step 🚀