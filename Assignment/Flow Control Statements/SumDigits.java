public class SumDigits {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please enter an integer");
            return;
        }
        int num = Integer.parseInt(args[0]);
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        System.out.println(sum);
    }
}
