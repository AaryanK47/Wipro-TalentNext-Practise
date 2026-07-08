// Write a Program that accepts two Strings as command line arguments and generate the output in the required format.
import java.util.Scanner;

public class FormatArguments {
    public static void main(String[] args) {
        String arg1, arg2;
        if (args.length >= 2) {
            arg1 = args[0];
            arg2 = args[1];
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first string: ");
            arg1 = scanner.nextLine();
            System.out.print("Enter second string: ");
            arg2 = scanner.nextLine();
            scanner.close();
        }
        System.out.println(arg1 + " Technologies " + arg2);
    }
}
