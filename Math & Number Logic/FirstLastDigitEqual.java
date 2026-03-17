//Take a 4-digit number and check if the first and last digits are equal. 
import java.util.Scanner;
public class FirstLastDigitEqual {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 4 digit number:");
        int digit=sc.nextInt();
        int firstDigit=digit / 1000;
        int lastDigit=digit % 10;
        if(firstDigit == lastDigit){
            System.out.println("Both digits are equal.");
        }
        else{
          System.out.println("Both aren't equal");
        }
        sc.close();
    }
}
