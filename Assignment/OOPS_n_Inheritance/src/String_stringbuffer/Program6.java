package String_stringbuffer;

/*
Hands-on Assignment:

Given 2 strings, a and b, return a new string of the form
short + long + short, with the shorter string on the outside
and the longer string on the inside.

The strings will not be the same length, but they may be empty (length 0).

Example:
Input : "hi" and "hello"
Output: hihellohi
*/

public class Program6 {

    public static void main(String[] args) {

        String a = "hi";
        String b = "hello";

        if (a.length() < b.length())
            System.out.println(a + b + a);
        else
            System.out.println(b + a + b);
    }
}
