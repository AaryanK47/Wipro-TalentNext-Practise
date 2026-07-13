package Classes_n_Objects;

/*
Hands-on Assignment:

Create a new class called Calculator with the following methods:

1. A static method called powerInt(int num1, int num2).
   This method should return num1 to the power num2.

2. A static method called powerDouble(double num1, int num2).
   This method should return num1 to the power num2.

3. Invoke both the methods and test the functionalities.

Hint:
Use Math.pow(double, double) to calculate the power.
*/

class Calculator {

    // Static method for integer power
    static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    // Static method for double power
    static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
}

public class TestCalculator {

    public static void main(String[] args) {

        System.out.println("Power of Integer : " + Calculator.powerInt(2, 5));

        System.out.println("Power of Double  : " + Calculator.powerDouble(2.5, 3));
    }
}