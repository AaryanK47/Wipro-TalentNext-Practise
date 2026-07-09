# 📂 Java Assignments - Wipro TalentNext

This repository contains Java assignments completed as part of the **Wipro TalentNext** Java learning program. The project is designed to build foundational Java programming skills, covering basic language syntax, command-line arguments, and flow control mechanisms.

## 💻 Tech Stack & Environment
- **Language**: Java 26
- **IDE**: Eclipse IDE
- **Build/Project Files**: Eclipse `.project` and `.classpath` configuration files are included.
- **Ignored Files**: Compiled files (like `bin/` directory and `.class` files) and local IDE metadata (such as `.settings/`, `.idea/`, and `*.iml` files) are excluded from the repository using [`.gitignore`](./.gitignore).

---

## 📁 Folder Structure

The project is organized into three main modules based on the topic of the assignments:

- **[`Language_Basics/`](./Language_Basics/)**: Contains introductory Java programs demonstrating command-line arguments and basic data processing.
- **[`Flow_Control_Statements/`](./Flow_Control_Statements/)**: Contains programs highlighting control flow constructs, including conditional statements, switches, and loops.
- **[`Arrays/`](./Arrays/)**: Contains programs demonstrating array operations, search/sort algorithms, and 2D arrays.

### Directory Details and Program List

#### 1. 📖 [`Language_Basics`](./Language_Basics/)

| Program | Description | How to Run |
| :--- | :--- | :--- |
| [FormatArgs.java](./Language_Basics/FormatArgs.java) | Accepts two strings and prints them in the format `[Arg1] Technologies [Arg2]` | `java FormatArgs Wipro Bangalore` |
| [Welcome.java](./Language_Basics/Welcome.java) | Accepts a name and prints a welcome message `Welcome [Name]` | `java Welcome John` |
| [Sum.java](./Language_Basics/Sum.java) | Accepts two integers and prints their sum | `java Sum 10 20` |

#### 2. 🔀 [`Flow_Control_Statements`](./Flow_Control_Statements/)

| Program | Description | How to Run |
| :--- | :--- | :--- |
| [PositiveNegative.java](./Flow_Control_Statements/PositiveNegative.java) | Checks if a given integer is positive, negative, or zero | `java PositiveNegative` |
| [LastDigit.java](./Flow_Control_Statements/LastDigit.java) | Checks if two non-negative integers have the same last digit | `java LastDigit` |
| [CheckArgs.java](./Flow_Control_Statements/CheckArgs.java) | Checks command-line arguments and prints them separated by commas | `java CheckArgs Mumbai Bangalore` |
| [CharOrder.java](./Flow_Control_Statements/CharOrder.java) | Displays two initialized characters in alphabetical order | `java CharOrder` |
| [CharType.java](./Flow_Control_Statements/CharType.java) | Checks if an initialized character is an alphabet, digit, or special character | `java CharType` |
| [Interest.java](./Flow_Control_Statements/Interest.java) | Prints interest percentage based on command-line gender and age | `java Interest Male 30` |
| [CaseConvert.java](./Flow_Control_Statements/CaseConvert.java) | Converts an initialized character's case and prints the mapping | `java CaseConvert` |
| [ColorCode.java](./Flow_Control_Statements/ColorCode.java) | Prints the color name corresponding to a color code character | `java ColorCode R` |
| [Month.java](./Flow_Control_Statements/Month.java) | Prints the corresponding month name for a given number | `java Month 12` |
| [PrintOneToTen.java](./Flow_Control_Statements/PrintOneToTen.java) | Prints numbers from 1 to 10 in a single row with tabs | `java PrintOneToTen` |
| [PrintEvens.java](./Flow_Control_Statements/PrintEvens.java) | Prints even numbers between 23 and 57 in separate rows | `java PrintEvens` |
| [PrimeCheck.java](./Flow_Control_Statements/PrimeCheck.java) | Checks if a given number is prime or not | `java PrimeCheck 17` |
| [PrimeRange.java](./Flow_Control_Statements/PrimeRange.java) | Prints prime numbers between 10 and 99 | `java PrimeRange` |
| [SumDigits.java](./Flow_Control_Statements/SumDigits.java) | Prints the sum of all digits of a given number | `java SumDigits 1234` |
| [FloydTriangle.java](./Flow_Control_Statements/FloydTriangle.java) | Prints asterisks in Floyd's triangle format for a given size | `java FloydTriangle 3` |
| [ReverseNumber.java](./Flow_Control_Statements/ReverseNumber.java) | Reverses a given number | `java ReverseNumber 1234` |
| [Palindrome.java](./Flow_Control_Statements/Palindrome.java) | Checks if a given number is a palindrome | `java Palindrome 110011` |

#### 3. 📊 [`Arrays`](./Arrays/)

| Program | Description | How to Run |
| :--- | :--- | :--- |
| [SumAverage.java](./Arrays/SumAverage.java) | Print the sum and average of an integer array | `java SumAverage` |
| [MaxMin.java](./Arrays/MaxMin.java) | Find the maximum and minimum values in an integer array | `java MaxMin` |
| [SearchArray.java](./Arrays/SearchArray.java) | Search an element in an array and print its index or -1 | `java SearchArray` |
| [AsciiChar.java](./Arrays/AsciiChar.java) | Print characters corresponding to ASCII values | `java AsciiChar` |
| [LargestSmallest.java](./Arrays/LargestSmallest.java) | Find the largest 2 numbers and the smallest 2 numbers in an array | `java LargestSmallest` |
| [SortArray.java](./Arrays/SortArray.java) | Initialize an array and print it in sorted order | `java SortArray` |
| [RemoveDuplicate.java](./Arrays/RemoveDuplicate.java) | Remove duplicate elements from an array | `java RemoveDuplicate` |
| [Sum67.java](./Arrays/Sum67.java) | Find the sum of array elements by ignoring numbers between 6 and 7 | `java Sum67` |
| [WithoutTen.java](./Arrays/WithoutTen.java) | Remove all 10's from the array and shift remaining elements left | `java WithoutTen` |
| [EvenOdd.java](./Arrays/EvenOdd.java) | Arrange even numbers before odd numbers | `java EvenOdd` |
| [Only14.java](./Arrays/Only14.java) | Check if an array contains only 1's and 4's | `java Only14` |
| [MiddleWay.java](./Arrays/MiddleWay.java) | Return a new array containing the middle elements of two arrays | `java MiddleWay` |
| [ReverseArray2D.java](./Arrays/ReverseArray2D.java) | Reverse the elements of a 2x2 array using command line arguments | `java ReverseArray2D 1 2 3 4` |
| [Biggest3x3.java](./Arrays/Biggest3x3.java) | Find the biggest number in a 3x3 array using command line arguments | `java Biggest3x3 1 2 3 4 5 6 7 8 9` |

---

## 🚀 Getting Started

Follow these steps to clone, import, and run the programs on your local machine.

### Prerequisites
Make sure you have the following installed:
- [Java SE Development Kit (JDK) 26](https://www.oracle.com/java/technologies/downloads/)
- [Eclipse IDE for Java Developers](https://www.eclipse.org/downloads/packages/release/2024-12/r/eclipse-ide-java-developers) (or any version supporting Java 26)

### 1. Clone the Repository
Clone the repository using Git:
```bash
git clone https://github.com/AaryanK47/Wipro-TalentNext-Practise.git
cd Wipro-TalentNext-Practise/Assignment
```

### 2. Import into Eclipse IDE
1. Open Eclipse IDE.
2. Go to **File** > **Import...**.
3. Expand the **General** folder and select **Existing Projects into Workspace**. Click **Next**.
4. Choose **Select root directory** and browse to the cloned `Assignment` folder.
5. Ensure the project is checked in the Projects list, and click **Finish**.
6. Eclipse will automatically recognize the `.project` and `.classpath` configuration files.

### 3. How to Compile & Run

#### Option A: Running from Eclipse IDE
1. Expand the project in the **Package Explorer**.
2. Navigate to either `Language_Basics` or `Flow_Control_Statements`.
3. Right-click on the Java file you want to run.
4. Select **Run As** > **Java Application**.
   - *Note: For programs requiring command-line arguments, select **Run As** > **Run Configurations...**, go to the **Arguments** tab, enter the arguments in the **Program arguments** box, and click **Run**.*

#### Option B: Running from Terminal / Command Prompt
Navigate to the directory of the module and compile/run the program:

##### For Language Basics:
```bash
# Navigate to the folder
cd Language_Basics

# Compile the files
javac *.java

# Run a program (e.g. FormatArgs with arguments)
java FormatArgs Wipro Bangalore
```

##### For Flow Control Statements:
```bash
# Navigate to the folder
cd Flow_Control_Statements

# Compile the files
javac *.java

# Run a program (e.g. Month with an argument)
java Month 12
```

##### For Arrays:
```bash
# Navigate to the folder
cd Arrays

# Compile the files
javac *.java

# Run a program (e.g. SumAverage)
java SumAverage
```
