//Take electricity units consumed and calculate the bill as per slabs (using if-else). 
import java.util.Scanner;
public class ElectricityBill{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your consuming units:");
        int units=sc.nextInt();
        int bill=0;
        if(units <= 0){
            System.out.println("Enter valid units.");
        }
        else if(units <= 100){
            bill=units * 1;
            System.out.println("My bill is:"+bill);
        }
        else if(units <= 200){
            bill=(100 * 1) + (units - 100) * 2;
            System.out.println("My bill is:"+bill);
        }
        else if(units <= 300){
            bill=(100 * 1) + (100 * 2) + (units - 200) * 3;
            System.out.println("My bill is:"+bill);
        }
        else{
            bill=(100 * 1) + (100 * 2) + (100 * 3) + (units - 300) * 5;
            System.out.println("My bill is:"+bill);
        }
        sc.close();
    }
}