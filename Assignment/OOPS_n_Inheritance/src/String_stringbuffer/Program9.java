package String_stringbuffer;

/*
Hands-on Assignment:

Given two strings, a and b, print a new string which is made
of the following combination:

First character of a,
First character of b,
Second character of a,
Second character of b,
and so on.

Any characters left will go to the end of the result.

Example:
Input : Hello, World
Output: HWeolrllod
*/

public class Program9 {

    public static void main(String[] args) {

        String a = "Hello";
        String b = "World";

        String result = "";

        int min = Math.min(a.length(), b.length());

        for (int i = 0; i < min; i++) {
            result += a.charAt(i);
            result += b.charAt(i);
        }

        result += a.substring(min);
        result += b.substring(min);

        System.out.println(result);
    }
}
