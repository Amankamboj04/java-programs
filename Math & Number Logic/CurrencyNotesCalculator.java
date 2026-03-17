//Write a program to calculate number of ₹2000, ₹500 and ₹100 notes for a given amount.
import java.util.Scanner;
public class CurrencyNotesCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a amount:");
        int x=sc.nextInt();
        if(x % 100 != 0){
            System.out.println("Amount cannot be represented using given denominations.");
        }
        else{
            int NoteOf2000=x / 2000;
            x=x%2000;
            int NoteOf500=x / 500;
            x=x % 500;
            int NoteOf100=x / 100;
            System.out.println("2000 note :"+NoteOf2000);
            System.out.println("500 note :"+NoteOf500);
            System.out.println("100 note :"+NoteOf100);
        }
        sc.close();
    }
}
