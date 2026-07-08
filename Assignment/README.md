# 📂 Assignment Solutions

This folder contains assignments for the Wipro TalentNext training program.

## 📁 Subdirectories

### 1. 📖 [Language Basics](./Language%20Basics/)
Contains basic Java programs demonstrating command-line arguments and fallback interactive keyboard input using `Scanner`.

| Program | Description | How to Run |
| :--- | :--- | :--- |
| [FormatArgs.java](./Language%20Basics/FormatArgs.java) | Accepts two strings and prints them in the format `[Arg1] Technologies [Arg2]` | `java FormatArgs Wipro Bangalore` |
| [Welcome.java](./Language%20Basics/Welcome.java) | Accepts a name and prints a welcome message `Welcome [Name]` | `java Welcome John` |
| [Sum.java](./Language%20Basics/Sum.java) | Accepts two integers and prints their sum | `java Sum 10 20` |

### 2. 🔀 [Flow Control Statements](./Flow%20Control%20Statements/)
*(Placeholder folder for upcoming flow control exercises)*

---

## 🛠️ How to Compile & Run

1. Navigate to the specific topic folder:
   ```bash
   cd "Assignment/Language Basics"
   ```
2. Compile the Java files:
   ```bash
   javac FormatArgs.java Welcome.java Sum.java
   ```
3. Run the programs:
   - **With Command-Line Arguments:**
     ```bash
     java FormatArgs Wipro Bangalore
     ```
   - **Interactively (Fallback):**
     If you run the programs without passing arguments, they will prompt you to enter the inputs directly in the terminal:
     ```bash
     java FormatArgs
     ```
