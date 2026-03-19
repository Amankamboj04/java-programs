//Take two numbers and check if both are positive and their sum is less than 100. 
import java.util.Scanner;
public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number first");
        int a=sc.nextInt();
         System.out.println("Enter number second");
        int b=sc.nextInt();
        if(a > 0 && b > 0 && a + b < 100){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}
