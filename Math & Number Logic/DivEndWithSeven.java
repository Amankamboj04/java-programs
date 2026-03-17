//Check if a number is a multiple of 7 or ends with 7. 
import java.util.Scanner;
public class DivEndWithSeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num % 7 == 0 || num % 10 == 7){
            System.out.println("Number is divide by 7 and Also Ends with 7.");
        }
        else{
              System.out.println("Number is neither divisible by 7 nor ends with 7.");

        }
        sc.close();
    }
    
}
