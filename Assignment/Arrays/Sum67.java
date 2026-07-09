// Q8: Find the sum of array elements by ignoring numbers between 6 and 7.

public class Sum67 {

    public static void main(String[] args) {

        int[] arr = {10, 3, 6, 1, 2, 7, 9};

        int sum = 0;
        boolean ignore = false;

        for (int num : arr) {

            if (num == 6) {
                ignore = true;
                continue;
            }

            if (ignore) {

                if (num == 7) {
                    ignore = false;
                }

                continue;
            }

            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}