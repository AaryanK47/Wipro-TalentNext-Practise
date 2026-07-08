// Write a Program that accepts two Strings as command line arguments and generate the output in the required format.
import java.util.Scanner;

public class FormatArgs {
    public static void main(String[] args) {
        String first, second;
        if (args.length >= 2) {
            first = args[0];
            second = args[1];
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first string: ");
            first = sc.nextLine();
            System.out.print("Enter second string: ");
            second = sc.nextLine();
            sc.close();
        }
        System.out.println(first + " Technologies " + second);
    }
}
