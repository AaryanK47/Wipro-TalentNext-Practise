// Write a Program to accept two integers as command line arguments and print the sum of the two numbers.
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a, b;
        if (args.length >= 2) {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number: ");
            a = sc.nextInt();
            System.out.print("Enter second number: ");
            b = sc.nextInt();
            sc.close();
        }
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }
}
