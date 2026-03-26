//Take a 3-digit number and check if the sum of the first and last digit equals the middle digit
import java.util.Scanner;
public class DigitCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int first = num / 100;
        int middle = (num / 10) % 10;
        int last = num % 10;

        if (first + last == middle) {
            System.out.println("Condition satisfied");
        } else {
            System.out.println("Condition not satisfied");
        }
        sc.close();
    }
}