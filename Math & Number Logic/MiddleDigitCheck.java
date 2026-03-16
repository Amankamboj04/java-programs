//Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither. 
import java.util.Scanner;

public class MiddleDigitCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 3 digits number: ");
        int num = sc.nextInt();

        int first = num / 100;
        int middle = (num / 10) % 10;
        int third = num % 10;

        if (middle > first && middle > third) {
            System.out.println("Middle digit is largest.");
        }
        else if (middle < first && middle < third) {
            System.out.println("Middle digit is smallest.");
        }
        else {
            System.out.println("Middle digit is neither largest nor smallest.");
        }

        sc.close();
    }
}