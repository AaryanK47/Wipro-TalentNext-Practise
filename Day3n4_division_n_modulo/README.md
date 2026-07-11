# ➗ Day 3 & 4: Division & Modulo - Wipro TalentNext

This module contains Java programs highlighting mathematical division and modulo operations, completed as part of the **Wipro TalentNext** training.

## 💻 Tech Stack & Environment
- **Language**: Java 26
- **IDE**: Eclipse IDE
- **Build/Project Files**: Eclipse `.project` and `.classpath` configuration files are included.
- **Ignored Files**: Compiled files (like `bin/` directory and `.class` files) and local IDE metadata (such as `.settings/` and local history) are excluded from the repository using [`.gitignore`](../.gitignore).

---

## 📁 Program List & Explanations

Here are the details of the programs contained in the `src/` folder:

| Program | Method Signature / Description | Example Test Cases |
| :--- | :--- | :--- |
| **[IsEven.java](./src/IsEven.java)** | `public static int isEven(int input1)` <br> Returns `2` if `input1` is even (positive, negative, or zero), otherwise returns `1`. | `isEven(4) -> 2`<br>`isEven(-4) -> 2`<br>`isEven(3) -> 1` |
| **[IsOdd.java](./src/IsOdd.java)** | `public static int isOdd(int input1)` <br> Returns `2` if `input1` is odd (positive or negative), otherwise returns `1` (including zero). | `isOdd(3) -> 2`<br>`isOdd(-3) -> 2`<br>`isOdd(0) -> 1` |
| **[LastDigit.java](./src/LastDigit.java)** | `public static int lastDigit(int input1)` <br> Returns the last digit (least significant digit / ones place) of the number as a positive value. | `lastDigit(197) -> 7`<br>`lastDigit(-197) -> 7`<br>`lastDigit(0) -> 0` |
| **[SecondLastDigit.java](./src/SecondLastDigit.java)** | `public static int secondLastDigit(int input1)` <br> Returns the second last digit (tens place) of the number as a positive value. Returns `-1` if it is a single-digit number. | `secondLastDigit(197) -> 9`<br>`secondLastDigit(-197) -> 9`<br>`secondLastDigit(5) -> -1` |
| **[SumLastDigits.java](./src/SumLastDigits.java)** | `public static int addLastDigits(int input1, int input2)` <br> Returns the sum of the last digits of two numbers, ignoring their signs. | `addLastDigits(267, 154) -> 11`<br>`addLastDigits(267, -154) -> 11` |

---

## 🚀 Getting Started

Follow these steps to import and run these programs on your local machine.

### 1. Import into Eclipse IDE
1. Open Eclipse IDE.
2. Go to **File** > **Import...**.
3. Expand the **General** folder and select **Existing Projects into Workspace**. Click **Next**.
4. Choose **Select root directory** and browse to the `Day3n4_division_n_modulo` folder.
5. Click **Finish**. Eclipse will automatically recognize the `.project` and `.classpath` configuration files.

### 2. Running from Eclipse IDE
1. Navigate to the `src` folder in the Package Explorer.
2. Right-click on the desired Java file (e.g., `IsEven.java`).
3. Select **Run As** > **Java Application**.

### 3. Running from Terminal
```bash
cd src
javac IsEven.java
java IsEven
```
