// Q5: Find the largest 2 numbers and the smallest 2 numbers in an array

import java.util.Arrays;

public class LargestSmallest {

    public static void main(String[] args) {

        int[] arr = {45, 12, 89, 3, 67, 24, 91, 5};

        Arrays.sort(arr);

        System.out.println("Smallest 1 = " + arr[0]);
        System.out.println("Smallest 2 = " + arr[1]);

        System.out.println("Largest 2 = " + arr[arr.length - 2]);
        System.out.println("Largest 1 = " + arr[arr.length - 1]);
    }
}