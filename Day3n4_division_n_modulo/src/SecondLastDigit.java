/*
 * Return second last digit of the given number
 * Write a function that returns the second last digit of the given number.
 * Second last digit is being referred to the digit in the tens place in the given number.
 * for example,
 * if the given number is 197, the second last digit is 9
 * 
 * Note1 - The second last digit should be returned as a positive number.
 * i.e. if the given number is -197, the second last digit is 9
 * 
 * Note2 - If the given number is a single digit number, then the second last digit does not exist. In such cases, the function should return -1.
 * i.e. if the given number is 5, the second last digit should be returned as -1
 */

public class SecondLastDigit {
    public static int secondLastDigit(int input1) {
        // If the number is a single digit number (between -9 and 9)
        if (input1 > -10 && input1 < 10) {
            return -1;
        }
        return Math.abs((input1 / 10) % 10);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("secondLastDigit(197) -> " + secondLastDigit(197) + " (Expected: 9)");
        System.out.println("secondLastDigit(-197) -> " + secondLastDigit(-197) + " (Expected: 9)");
        System.out.println("secondLastDigit(5) -> " + secondLastDigit(5) + " (Expected: -1)");
        System.out.println("secondLastDigit(-5) -> " + secondLastDigit(-5) + " (Expected: -1)");
        System.out.println("secondLastDigit(0) -> " + secondLastDigit(0) + " (Expected: -1)");
        System.out.println("secondLastDigit(10) -> " + secondLastDigit(10) + " (Expected: 1)");
        System.out.println("secondLastDigit(-10) -> " + secondLastDigit(-10) + " (Expected: 1)");
    }
}
