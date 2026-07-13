package String_stringbuffer;

/*
Hands-on Assignment:

Given a string and an integer n, print a new string made
of n repetitions of the last n characters of the string.

You may assume that n is between 0 and the length
of the string, inclusive.

Example:
Input : Wipro, 3
Output: propropro
*/

public class Program10 {

    public static void main(String[] args) {

        String str = "Wipro";
        int n = 3;

        String last = str.substring(str.length() - n);

        String result = "";

        for (int i = 0; i < n; i++) {
            result += last;
        }

        System.out.println(result);
    }
}