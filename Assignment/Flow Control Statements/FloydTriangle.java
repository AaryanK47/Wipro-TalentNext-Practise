public class FloydTriangle {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter an integer number");
            return;
        }
        int n;
        try {
            n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Please enter an integer number");
            return;
        }
        int i = 1;
        while (i <= n) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            i++;
        }
    }
}
