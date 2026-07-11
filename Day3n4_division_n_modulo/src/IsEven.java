/*
 * Is Even?
 * Write a function to find whether the given input number is Even.
 * If the given number is even, the function should return 2 else it should return 1.
 * Note: The number passed to the function can be negative, positive or zero. Zero should be treated as Even.
 */

public class IsEven {
    public static int isEven(int input1) {
        if (input1 % 2 == 0) {
            return 2;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("isEven(4) -> " + isEven(4) + " (Expected: 2)");
        System.out.println("isEven(-4) -> " + isEven(-4) + " (Expected: 2)");
        System.out.println("isEven(0) -> " + isEven(0) + " (Expected: 2)");
        System.out.println("isEven(3) -> " + isEven(3) + " (Expected: 1)");
        System.out.println("isEven(-3) -> " + isEven(-3) + " (Expected: 1)");
    }
}
