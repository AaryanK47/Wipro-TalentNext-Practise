// Q13: Reverse the elements of a 2x2 array using command line arguments.

public class ReverseArray2D {

    public static void main(String[] args) {

        if (args.length != 4) {
            System.out.println("Please enter 4 integers.");
            return;
        }

        int[][] arr = new int[2][2];

        int k = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = Integer.parseInt(args[k++]);
            }
        }

        System.out.println("Original Array:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Reversed Array:");

        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}