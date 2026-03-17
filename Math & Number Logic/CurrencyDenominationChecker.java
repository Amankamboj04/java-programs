//Check if an amount can be evenly divided into 2000, 500, and 100 currency notes. 
import java.util.Scanner;
public class CurrencyDenominationChecker{
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Amount:");
    int amt=sc.nextInt();
    if(amt % 100 == 0){
        System.out.println("Amount can be divided into 2000, 500, and 100 notes.");
    }
    else{
        System.out.println("Amount cannot be divided into given denominations.");
    }
    sc.close();
 }
}