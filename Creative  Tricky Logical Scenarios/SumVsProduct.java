//Take an integer (1–9999) and check if the sum of its digits is greater than the product of its digits
import java.util.Scanner;
public class SumVsProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int sum = 0;
        int product = 1;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }

        if (sum > product) {
            System.out.println("Sum is greater than Product");
        } else {
            System.out.println("Product is greater or equal");
        }
        sc.close();
    }
}