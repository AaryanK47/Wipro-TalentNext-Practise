public class ColorCode {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Invalid Code");
            return;
        }
        char code = args[0].charAt(0);
        switch (code) {
            case 'R':
            case 'r':
                System.out.println("Red");
                break;
            case 'B':
            case 'b':
                System.out.println("Blue");
                break;
            case 'G':
            case 'g':
                System.out.println("Green");
                break;
            case 'O':
            case 'o':
                System.out.println("Orange");
                break;
            case 'Y':
            case 'y':
                System.out.println("Yellow");
                break;
            case 'W':
            case 'w':
                System.out.println("White");
                break;
            default:
                System.out.println("Invalid Code");
        }
    }
}
