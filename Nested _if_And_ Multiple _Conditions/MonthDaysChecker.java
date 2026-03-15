import java.util.Scanner;
public class MonthDaysChecker{
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month number (1-12):");
        int mon = sc.nextInt();

        if(mon < 1 || mon > 12){
            System.out.println("Enter valid month number");
        }
        else if(mon == 1){
            System.out.println("January has 31 days");
        }
        else if(mon == 2){
            System.out.println("February has 28 days");
        }
        else if(mon == 3){
            System.out.println("March has 31 days");
        }
        else if(mon == 4){
            System.out.println("April has 30 days");
        }
        else if(mon == 5){
            System.out.println("May has 31 days");
        }
        else if(mon == 6){
            System.out.println("June has 30 days");
        }
        else if(mon == 7){
            System.out.println("July has 31 days");
        }
        else if(mon == 8){
            System.out.println("August has 31 days");
        }
        else if(mon == 9){
            System.out.println("September has 30 days");
        }
        else if(mon == 10){
            System.out.println("October has 31 days");
        }
        else if(mon == 11){
            System.out.println("November has 30 days");
        }
        else{
            System.out.println("December has 31 days");
        }

        sc.close();
    }
}