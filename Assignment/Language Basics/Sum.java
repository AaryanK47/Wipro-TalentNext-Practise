// Write a Program to accept two integers as command line arguments and print the sum of the two numbers.
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int num1, num2;
        if (args.length >= 2) {
            num1 = Integer.parseInt(args[0]);
            num2 = Integer.parseInt(args[1]);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            num2 = scanner.nextInt();
            scanner.close();
        }
        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}
