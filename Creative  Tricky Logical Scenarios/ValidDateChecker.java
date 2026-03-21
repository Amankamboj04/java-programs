//Take day and month and check if it forms a valid calendar date (ignoring leap years). 
import java.util.Scanner;
public class ValidDateChecker {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
     System.out.println("Enter days:");
     int day=sc.nextInt();
      System.out.println("Enter months:");
     int month=sc.nextInt();
     boolean isValid=true;
      if(day < 1 || day > 31 || month < 1 || month > 12){
          isValid=false;
      }
      else if(month == 2){
          if(day < 1 || day > 28){
              isValid=false;
          }
      }
      else if(month == 4 || month == 6 || month == 9 || month == 11){
          if(day < 1 || day > 30){
              isValid=false;
          }
      }
      else {
            if(day < 1 || day > 31)
                isValid = false;
        }
        if(isValid)
            System.out.println("Valid Date");
        else
            System.out.println("Invalid Date");

        sc.close();
    }
}