// Write a Java program to find if the given number is palindrome or not
public class Palindrome {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter a number");
            return;
        }
        int num = Integer.parseInt(args[0]);
        int temp = num;
        int reversed = 0;
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        if (num == reversed) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}
