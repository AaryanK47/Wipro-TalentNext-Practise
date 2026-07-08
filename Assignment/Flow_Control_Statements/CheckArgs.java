// Write a program to check if the program has received command line arguments or not. 
// If the program has not received arguments then print "No Values", else print all the values in a 
// single line separated by ,(comma)
public class CheckArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No values");
        } else {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }
}
