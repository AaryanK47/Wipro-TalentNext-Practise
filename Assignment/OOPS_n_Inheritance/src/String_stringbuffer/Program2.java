package String_stringbuffer;

/*
Hands-on Assignment:

Write a java program that will concatenate 2 strings and return the result.
The result should be in lowercase.

Note:
If the concatenation creates a double-character, then one of the characters
needs to be omitted.
*/

public class Program2 {

    public static void main(String[] args) {

        String s1 = "Sachin";
        String s2 = "Tendulkar";

        if (s1.charAt(s1.length() - 1) == s2.charAt(0))
            System.out.println((s1 + s2.substring(1)).toLowerCase());
        else
            System.out.println((s1 + s2).toLowerCase());
    }
}