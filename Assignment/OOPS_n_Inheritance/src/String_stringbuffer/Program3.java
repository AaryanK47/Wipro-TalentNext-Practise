package String_stringbuffer;

/*
Hands-on Assignment:

Given a string, return a new string made of 'n' copies of the first
2 chars of the original string where 'n' is the length of the string.

Example:
Input : Wipro
Output: WiWiWiWiWi
*/

public class Program3 {

    public static void main(String[] args) {

        String str = "Wipro";
        String result = "";

        String first = str.substring(0, 2);

        for (int i = 0; i < str.length(); i++) {
            result += first;
        }

        System.out.println(result);
    }
}
