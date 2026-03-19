//Take income and age, and check if eligible for tax (age > 18 and income > 5 L). 
import java.util.Scanner;
public class CheckEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
         System.out.println("Enter income");
        int income=sc.nextInt();
        if(age > 18 && income > 500000){
            System.out.println("Eligible for tax");
        }
        else{
            System.out.println("Not eligibble");
        }
        sc.close();
    }
}
