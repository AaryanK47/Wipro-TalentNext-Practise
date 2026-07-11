/*
 * Sum of last digits of two given numbers
 * Rohit wants to add the last digits of two given numbers.
 * For example,
 * If the given numbers are 267 and 154, the output should be 11.
 * Below is the explanation -
 * Last digit of the 267 is 7
 * Last digit of the 154 is 4
 * Sum of 7 and 4 = 11
 * 
 * Write a program to help Rohit achieve this for any given two numbers.
 * The prototype of the method should be -
 * int addLastDigits(int input1, int input2);
 * 
 * Note: The sign of the input numbers should be ignored.
 * i.e.
 * if the input numbers are 267 and 154, the sum of last two digits should be 11
 * if the input numbers are 267 and -154, the sum of last two digits should be 11
 * if the input numbers are -267 and 154, the sum of last two digits should be 11
 * if the input numbers are -267 and -154, the sum of last two digits should be 11
 */

public class SumLastDigits {
    public static int addLastDigits(int input1, int input2) {
        int lastDigit1 = Math.abs(input1 % 10);
        int lastDigit2 = Math.abs(input2 % 10);
        return lastDigit1 + lastDigit2;
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("addLastDigits(267, 154) -> " + addLastDigits(267, 154) + " (Expected: 11)");
        System.out.println("addLastDigits(267, -154) -> " + addLastDigits(267, -154) + " (Expected: 11)");
        System.out.println("addLastDigits(-267, 154) -> " + addLastDigits(-267, 154) + " (Expected: 11)");
        System.out.println("addLastDigits(-267, -154) -> " + addLastDigits(-267, -154) + " (Expected: 11)");
    }
}
