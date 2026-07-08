// Write a program to reverse a given number and print
public class ReverseNumber {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter a number");
            return;
        }
        int num = Integer.parseInt(args[0]);
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println(reversed);
    }
}
