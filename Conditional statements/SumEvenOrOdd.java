// Write a program to accept two numbers and print whether their sum is EVEN or ODD
import java.util.Scanner;

public class SumEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int sum = num1 + num2;
        if (sum % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
        
        scanner.close();
    }
}
