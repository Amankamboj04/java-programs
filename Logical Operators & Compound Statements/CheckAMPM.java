//Take 24-hour time (hours and minutes) and print whether it is AM or PM. 
import java.util.Scanner;
public class CheckAMPM {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter hours (0-23)");
        int hour=sc.nextInt();
        System.out.println("Enter minutes (0-59)");
        int minutes=sc.nextInt();
        if(hour >=0 && hour <= 23 && minutes >= 0 && minutes <= 59 ){
        if(hour < 12){
            System.out.println("AM");
        }
        else{
            System.out.println("PM");
        }
    }
    else{
        System.out.println("Enter valid hour and mints.");
    }
        sc.close();
    }
}
