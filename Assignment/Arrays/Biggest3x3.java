// Q14: Find the biggest number in a 3x3 array using command line arguments.

public class Biggest3x3 {

    public static void main(String[] args) {

        if (args.length != 9) {
            System.out.println("Please enter 9 integers.");
            return;
        }

        int[][] arr = new int[3][3];

        int k = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                arr[i][j] = Integer.parseInt(args[k++]);

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("Array:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("Biggest Number = " + max);
    }
}