// Initialize a character variable in a program and print 'Alphabet' if it is an alphabet, 'Digit' if it is a number, and 'Special Character' otherwise.
public class CharType {
    public static void main(String[] args) {
        char ch = '*';
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}
