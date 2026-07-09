// Q6: Initialize an array and print it in sorted order.


import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] arr = {45, 12, 78, 3, 56, 21};

        Arrays.sort(arr);

        System.out.print("Sorted Array: ");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}