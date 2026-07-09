// Q2: Find the maximum and minimum values in an integer array.

public class MaxMin {

    public static void main(String[] args) {

        int[] arr = {25, 12, 78, 4, 56, 89, 1};

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}