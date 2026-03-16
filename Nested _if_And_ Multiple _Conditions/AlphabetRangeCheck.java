// Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’. 
import java.util.Scanner;
public class AlphabetRangeCheck{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any alpahbet:");
        char ch=Character.toLowerCase(sc.next().charAt(0));
        if(ch >='a' && ch <='m'){
            System.out.println("Alphabet "+ch+" lies between a and m.");
        }
        else if(ch >='n' && ch <='z'){
              System.out.println("Alphabbet "+ch+" is lies betwenn n and z.");
        }
        else{
            System.out.println("Invalid Input.");
        }
        sc.close();
    }
}
