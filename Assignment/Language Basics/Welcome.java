// Write a Program to accept a String as a command line argument and print a Welcome message.
import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        String str;
        if (args.length >= 1) {
            str = args[0];
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter name: ");
            str = sc.nextLine();
            sc.close();
        }
        System.out.println("Welcome " + str);
    }
}
