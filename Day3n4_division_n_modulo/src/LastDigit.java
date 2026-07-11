/*
 * Return last digit of the given number
 * Write a function that returns the last digit of the given number.
 * Last digit is being referred to the least significant digit i.e. the digit in the ones (units) place in the given number.
 * The last digit should be returned as a positive number.
 * for example,
 * if the given number is 197, the last digit is 7
 * if the given number is -197, the last digit is 7
 */

public class LastDigit {
    public static int lastDigit(int input1) {
        return Math.abs(input1 % 10);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("lastDigit(197) -> " + lastDigit(197) + " (Expected: 7)");
        System.out.println("lastDigit(-197) -> " + lastDigit(-197) + " (Expected: 7)");
        System.out.println("lastDigit(0) -> " + lastDigit(0) + " (Expected: 0)");
        System.out.println("lastDigit(5) -> " + lastDigit(5) + " (Expected: 5)");
        System.out.println("lastDigit(-5) -> " + lastDigit(-5) + " (Expected: 5)");
    }
}
