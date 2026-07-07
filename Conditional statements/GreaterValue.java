// Write a program to accept two numbers and print the greater value of the two
import java.util.Scanner;

public class GreaterValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        if (num1 > num2) {
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }
        
        scanner.close();
    }
}
