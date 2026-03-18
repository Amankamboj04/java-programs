//Take two angles of a triangle and compute the third angle. 
import java.util.Scanner;
public class ComputeThirdAngle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first angle value:");
        int a=sc.nextInt();
        System.out.println("Enter second angle value:");
        int b=sc.nextInt();
        if(a > 0 && b > 0 && a + b < 180){
            int thirdAngle = 180 - (a + b);
            System.out.println("Third angle is: " + thirdAngle);
            } else {
            System.out.println("Invalid angles. Angles must be positive and sum less than 180.");            }        
        sc.close();
    }
}
