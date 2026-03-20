//Take a weekday number (1–7) and determine if it is a weekday or weekend. 
import java.util.Scanner;
public class CheckWeekday {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number from week days:");
        int num=sc.nextInt();
        if(num <= 0 || num > 7){
             System.out.println("Enter valid week day.");
        }
        else if(num >= 1 && num <=5){
            System.out.println("Its a weekday");
        }
        else{
            System.out.println("Oh Great It's a weekend.");
        }
        sc.close();
    }
}
