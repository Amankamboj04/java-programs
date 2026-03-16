//Check if one of two given numbers is a multiple of the other
import java.util.Scanner;
public class MultipleChecker {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a=sc.nextInt();
        System.out.println("Enter value of b:");
        int b=sc.nextInt();
        if(a==0 & b==0){
            System.out.println("Cannot check multiple with zero");
        }
       if(a%b==0){
           System.out.println("A is multiple of B.");
       }
       else if(b % a==0){
        System.out.println("B is multiple of A.");
       }
       else{
           System.out.println("Neither is a multiple of the other..");
       }
       sc.close();
    }
}
