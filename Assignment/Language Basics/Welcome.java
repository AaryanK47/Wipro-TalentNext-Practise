// Write a Program to accept a String as a command line argument and print a Welcome message.
import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        String name;
        if (args.length >= 1) {
            name = args[0];
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            scanner.close();
        }
        System.out.println("Welcome " + name);
    }
}
