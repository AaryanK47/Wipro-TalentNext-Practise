// Write a Program to accept a String as a command line argument and print a Welcome message.

public class Welcome {
    public static void main(String[] args) {

        if (args.length != 1) {
            System.out.println("Please pass one command line argument.");
            return;
        }

        System.out.println("Welcome " + args[0]);
    }
}