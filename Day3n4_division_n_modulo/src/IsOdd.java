/*
 * Is Odd?
 * Write a function to find whether the given input number is Odd.
 * If the given number is odd, the function should return 2 else it should return 1.
 * Note: The number passed to the function can be negative, positive or zero. Zero should NOT be treated as odd.
 */

public class IsOdd {
    public static int isOdd(int input1) {
        if (input1 % 2 != 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("isOdd(3) -> " + isOdd(3) + " (Expected: 2)");
        System.out.println("isOdd(-3) -> " + isOdd(-3) + " (Expected: 2)");
        System.out.println("isOdd(4) -> " + isOdd(4) + " (Expected: 1)");
        System.out.println("isOdd(-4) -> " + isOdd(-4) + " (Expected: 1)");
        System.out.println("isOdd(0) -> " + isOdd(0) + " (Expected: 1)");
    }
}
