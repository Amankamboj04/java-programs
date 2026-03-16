//Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good Evening”, or “Good Night”. 
import java.util.Scanner;
public class GreetingByHour{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Clock time from (0 to 23):");
        int a = sc.nextInt();

        if(a < 0 || a > 23){
            System.out.println("Enter valid clock hour.");
        }
        else if(a <= 11){
            System.out.println("Good Morning!!!");
        }
        else if(a <= 16){
            System.out.println("Good Afternoon!!!");
        }
        else if(a <= 19){
            System.out.println("Good Evening!!!");
        }
        else{
            System.out.println("Good Night!!!");
        }

        sc.close();
    }
}