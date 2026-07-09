// Q4: Print characters corresponding to ASCII values.

public class AsciiChar {

    public static void main(String[] args) {

        int[] ascii = {65, 66, 67, 68, 69, 70};

        for (int value : ascii) {
            System.out.print((char) value + " ");
        }
    }
}