# Assessment 004 - Summative

## Learning Outcomes Assessed

* Data Structures
* Data Manipulation
* String Formatting
* Loops
* CLI Commands
* APIs

---

# Assessment Structure

This assessment has **two sections**:

1. **Coding Assessment** (Questions are below)
2. **Long Questions** (Questions are below) – `answers.txt`

You may complete the questions **in any order**.

---

# Your Goal

Read the instructions for each **coding question**, then complete each method in **`Summative.java`** while ensuring that:

* The code is **valid Java**
* Each method behaves **according to the instructions**
* All **unit tests pass successfully**

Read the instructions for each **long-format question**, then add your answers under each relevant comment in **`answers.txt`** while ensuring that:

* **DO NOT remove the comments**
* **Read each question carefully before answering**

---

# How to Run Your Tests

This project uses **Maven and JUnit**.

### Run all tests

```bash
mvn test
```

### Run tests with detailed output

```bash
mvn -X test
```

---

# Scoring & Weighting

| Component                             | Weight |
| ------------------------------------- | ------ |
| Coding Section (unit tests)           | 50%    |
| Long-format Questions (`answers.txt`) | 50%    |

---

# Fundamentals Coding Assessment

This assessment consists of **five Java methods**.

Each method has a **partially written implementation**.

Your task is to:

* Fix bugs
* Complete the missing logic
* Ensure all unit tests pass

---

# Project Structure

```
fun-004-summative/
├── pom.xml                     # Maven configuration
├── answers.txt                 # Write answers to long questions here
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/assessment/
│   │            └── Summative.java     # <-- Write your solutions here
│   │
│   └── test/
│       └── java/
│           └── com/assessment/
│                └── SummativeTest.java # <-- Unit tests
│
└── README.md                   # Assessment instructions
```

---

# Coding Questions

## Question 1 — reverseList(items)

The data engineering team at a Johannesburg logistics company receives daily delivery records as an ordered list — but their reporting dashboard displays data in **reverse chronological order**, meaning the most recent entry must come first.

Rather than reloading the data from scratch, the team needs a simple utility that flips any list they give it.

Apply your logic to the **`reverseList()`** method.

You will receive a list of items and must return a **new list with the elements in reverse order**.

Do **not modify the original list**.

### Input

```
[1, 2, 3, 4, 5]
```

### Output

```
[5, 4, 3, 2, 1]
```

---

# Question 2 — sumEvenNumbers(numbers)

A small accounting firm in Pretoria is auditing a list of transaction amounts.

Their compliance rules only apply to **even-numbered amounts** (a quirk of their legacy system), so the auditors need a quick way to calculate the total of only the even values in any list of numbers.

Apply your logic to the **`sumEvenNumbers()`** method.

You will receive a list of integers and must **return the sum of only the even numbers**.

If there are **no even numbers**, return **0**.

### Input

```
[1, 2, 3, 4, 5, 6]
```

### Output

```
12
```

---

# Question 3 — findCommonSkills(applicants)

A tech recruitment agency in the Sandton CBD is hosting a career fair for top South African engineering graduates.

Each applicant has submitted a **list of their skills**. Hiring managers want to know which skills **every applicant has in common**, so they can design a shared baseline technical test.

Apply your logic to **`findCommonSkills()`**.

You will receive a **map where**:

* the **key** is an applicant name
* the **value** is a list of their skills

Return a **set of skills** that appear in **every applicant's list**.

### Input

```
{
"Lerato": ["Python", "SQL", "Git", "Docker"],
"Thabo": ["Python", "SQL", "Java", "Git"],
"Nandi": ["Python", "SQL", "Git", "React"]
}
```

### Output

```
{"Python", "SQL", "Git"}
```

---

# Question 4 — stageSummary(records)

Eskom's public API has been down for weeks, but a junior developer managed to pull a snapshot of **load shedding incident data** before it went offline.

The data is stored locally as **`loadshedding.json`**, containing incidents recorded across South African suburbs. Each incident shows **which stage was active and for how long**.

Your team lead needs a quick report:

**How many total hours was each stage active across all areas and all dates?**

Apply your logic to **`stageSummary()`**.

The method receives a list of incident records and must return a **map** where:

* the key is `"Stage X"`
* the value is the **total hours recorded for that stage**
* values must be **rounded to 2 decimal places**

Only include stages that **appear in the data**.

If the input is **empty**, return an **empty map**.

### Example Input

```
[
{
"incident_id": "ESK-20240601-001",
"area": "Soweto",
"stage": 2,
"duration_hours": 2.5
},
{
"incident_id": "ESK-20240601-002",
"area": "Sandton",
"stage": 4,
"duration_hours": 4.0
}
]
```

### Output

```
{"Stage 2": 2.5, "Stage 4": 4.0}
```

---

# Question 5 — slidingWindowSum(numbers, windowSize)

Eskom's load management engineers in **Megawatt Park, Sunninghill** monitor electricity consumption collected every hour from a township substation.

To smooth out spikes, they use a **sliding window technique**.

At each position they calculate the total consumption across **k consecutive hours**. This helps identify **sustained high-usage periods** rather than single spikes.

Apply your logic to **`slidingWindowSum()`**.

Given:

* a list of numbers
* a window size `k`

Return a **new list** where each element is the **sum of k consecutive elements**.

The last window starts at:

```
len(numbers) - k
```

### Input

```
numbers = [2, 4, 6, 8, 10]
windowSize = 3
```

### Output

```
[12, 18, 24]
```

Constraint:

The output list will always contain:

```
len(numbers) - windowSize + 1
```

elements.

---

# Long-Format Questions

Please answer these in **`answers.txt`**.

**DO NOT remove the comments and DO NOT change the format.**

---

## Comprehension Question 1 — Loops (10 Points)

A junior developer on your team at a Cape Town startup keeps writing code that works but uses the wrong loop for the job.

Your tech lead asks you to explain **how loops work and how to decide which one to use**.

Explain:

* What loops are
* The different types of loops
* When to use each type

Use **realistic developer scenarios**, not just theory.

---

## Comprehension Question 2 — Functions (10 Points)

You are a junior developer at a Johannesburg fintech startup.

Your team is building a payment processing system, but the same **transaction fee calculation code appears in five different places** in the codebase.

Explain:

* What a **function** is in programming
* Why functions solve this problem
* The benefit of defining logic **once**
* What **parameters** and **return values** are
* How they apply in this scenario

---

## Comprehension Question 3 — APIs and HTTP (10 Points)

During your first week at a software company in Johannesburg, a product manager asks how the company's **mobile app communicates with the server**.

Explain:

* What an **API** is
* How communication works using **HTTP**
* Types of requests (`GET`, `POST`, etc.)
* What an **endpoint** is

You may use **analogies** to make the explanation clearer.
