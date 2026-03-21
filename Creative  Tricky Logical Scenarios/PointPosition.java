//Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the origin
import java.util.Scanner;
public class PointPosition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of X-axis:");
        int x=sc.nextInt();
        System.out.println("Enter value of Y-axis:");
        int y=sc.nextInt();
        if(x == 0 && y == 0){
            System.out.println("Point lies at Origin.");
        }
        else if(x == 0){
            System.out.println("Point lies at Y-axis.");
        }
        else if(y == 0){
            System.out.println("Point lies at X-axis");
        }
        else{
            System.out.println("Not at any axis");
        }
        sc.close();
    }
}
