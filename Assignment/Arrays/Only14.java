// Q11: Check if an array contains only 1's and 4's.

public class Only14 {

    public static void main(String[] args) {

        int[] arr = {1, 4, 4, 1, 1};

        boolean valid = true;

        for (int num : arr) {

            if (num != 1 && num != 4) {
                valid = false;
                break;
            }
        }

        System.out.println(valid);
    }
}