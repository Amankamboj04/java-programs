//Check whether a number is a perfect square (without using the square root function). 
import java.util.Scanner;
public class CheckNumberPerfectSquare {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number:");
    int num=sc.nextInt();
    boolean isPerfectSquare=false;
    for(int i=1; i<=num; i++){
        if(i * i == num){
            isPerfectSquare=true;
            break;
        }
    }
    if(isPerfectSquare == true){
        System.out.println("Number is perfect square.");
    }
    else{
        System.out.println("Number is not perfect square.");
    }
    sc.close();
   }    
}
