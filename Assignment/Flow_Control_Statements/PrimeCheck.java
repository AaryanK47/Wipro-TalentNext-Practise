// Write a program to check if a given number is prime or not.
public class PrimeCheck {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter an integer");
            return;
        }
        int num = Integer.parseInt(args[0]);
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
