// Q9: Remove all 10's from the array and shift remaining elements left.

public class WithoutTen {

    public static void main(String[] args) {

        int[] arr = {1, 10, 10, 2};

        int[] result = new int[arr.length];

        int index = 0;

        for (int num : arr) {

            if (num != 10) {
                result[index++] = num;
            }
        }

        System.out.print("Result Array: ");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}