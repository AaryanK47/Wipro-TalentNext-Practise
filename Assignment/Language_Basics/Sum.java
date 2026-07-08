// Write a Program to accept two integers as command line arguments and print the sum of the two numbers.

public class Sum {
    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Please pass two command line arguments.");
            return;
        }

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int sum = a + b;

        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }
}