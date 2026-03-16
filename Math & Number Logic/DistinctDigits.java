//Take a 3-digit number and check if all digits are distinct. 
import java.util.Scanner;
public class DistinctDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a 3 digits number:");
        int num=sc.nextInt();
        int first=num/100;
        int second=(num/10)%10;
        int third=num%10;
        if(first != second && second != third && third != first ){
            System.out.println("All digits are distinct.");
        }
        else{
            System.out.println("All digits aren't distinct.");
        }     
     sc.close(); 

    }
}
