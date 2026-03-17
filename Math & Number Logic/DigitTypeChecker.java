//Check whether a given integer is single-digit, double-digit, or multi-digit. 
import java.util.Scanner;
public class DigitTypeChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbber:");
        int num=sc.nextInt();
        num=Math.abs(num);
        if(num >= 0 && num <=9 ){
            System.out.println("Single digit number.");
        }
        else if(num >=10 && num <=99){
            System.out.println("Double digit number.");
        }
        else{
            System.out.println("Multi digit number.");
        }
        sc.close();
    }
    
}
