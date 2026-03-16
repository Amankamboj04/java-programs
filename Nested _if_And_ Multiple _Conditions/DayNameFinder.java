// Take a day number (1–7) and print the corresponding day name
import java.util.Scanner;
public class DayNameFinder {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number of any day (1–7):");
        int day = sc.nextInt();

        if(day < 1 || day > 7){
            System.out.println("Enter valid day number");
        }
        else if(day == 1){
            System.out.println("Monday");
        }
        else if(day == 2){
            System.out.println("Tuesday");
        }
        else if(day == 3){
            System.out.println("Wednesday");
        }
        else if(day == 4){
            System.out.println("Thursday");
        }
        else if(day == 5){
            System.out.println("Friday");
        }
        else if(day == 6){
            System.out.println("Saturday");
        }
        else{
            System.out.println("Sunday");
        }

        sc.close();
    }
}