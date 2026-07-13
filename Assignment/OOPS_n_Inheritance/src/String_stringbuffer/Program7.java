package String_stringbuffer;

/*
Hands-on Assignment:

Given a string, if the first or last characters are 'x',
return the string without those 'x' characters,
otherwise return the string unchanged.

Example:
Input : xHix
Output: Hi
*/

public class Program7 {

    public static void main(String[] args) {

        String str = "xHix";

        if (str.startsWith("x"))
            str = str.substring(1);

        if (str.endsWith("x"))
            str = str.substring(0, str.length() - 1);

        System.out.println(str);
    }
}
