// Write a Program that accepts two Strings as command line arguments and generate the output in the required format.
public class FormatArgs {
	public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Please pass two command line arguments.");
            return;
        }

        System.out.println(args[0] + " Technologies " + args[1]);
    }
}
