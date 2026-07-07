// Write a program to accept a number N and print whether the number is EVEN or ODD
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if (n % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
        
        scanner.close();
    }
}
