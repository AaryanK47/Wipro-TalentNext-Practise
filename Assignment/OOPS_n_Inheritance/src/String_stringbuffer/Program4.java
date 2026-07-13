package String_stringbuffer;

/*
Hands-on Assignment:

Write a java program that will return the first half of the string,
if the length of the string is even.
It should return null for odd length string.
*/

public class Program4 {

    public static void main(String[] args) {

        String str = "TomCat";

        if (str.length() % 2 == 0)
            System.out.println(str.substring(0, str.length() / 2));
        else
            System.out.println("null");
    }
}
