package String_stringbuffer;

/*
Hands-on Assignment:

Write a java program that accepts a string and returns a new string
without the first and last character of the input string.

Example:
Input : Suman
Output: uma
*/

public class Program5 {

    public static void main(String[] args) {

        String str = "Suman";

        System.out.println(str.substring(1, str.length() - 1));
    }
}