package String_stringbuffer;

/*
Hands-on Assignment:

Write a Java program that accepts a string (with * in it).

The program should return a new string in which the following
characters are removed:
- *
- the character to the left of *
- the character to the right of *

Example:
Input : ab*cd
Output: ad
*/

public class Program8 {

    public static void main(String[] args) {

        String str = "ab*cd";
        int index = str.indexOf('*');

        String result = str.substring(0, index - 1)
                + str.substring(index + 2);

        System.out.println(result);
    }
}