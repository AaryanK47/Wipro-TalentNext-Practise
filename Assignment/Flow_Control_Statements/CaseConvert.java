// Initialize a character variable with an alphabet in a program. If it is in lowercase, display in uppercase, and vice-versa.
public class CaseConvert {
    public static void main(String[] args) {
        char ch = 'a';
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + "->" + Character.toUpperCase(ch));
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + "->" + Character.toLowerCase(ch));
        }
    }
}
