//Check if a number lies within the range [100, 999]. 
import java.util.Scanner;
public class CheckRange100To999 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num >= 100 && num <= 999){
            System.out.println("Number lies within 100 and 999.");
        }
        else{
        System.out.println("Number doesn't lie within 100 and 999.");
        }
        sc.close();
    }
    
}
