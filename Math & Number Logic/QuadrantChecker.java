//Take coordinates (x, y) and determine which quadrant the point lies in.
import java.util.Scanner;
public class QuadrantChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter X coordinate:");
        int x=sc.nextInt();
        System.out.print("Enter Y coordinate:");
        int y=sc.nextInt();
        if(x > 0 && y >0){
            System.out.println(" Point lies in Quadrant 1.");
        }
        else if(x < 0 && y > 0){
            System.out.println("Point lies in Quadrant 2.");
        }
        else if(x < 0 && y < 0){
            System.out.println("Point lies in Quadrant 3.");
        }
        else if(x > 0 && y < 0){
            System.out.println("Point lies in Quadrant 4.");
        }
        else if(x == 0 && y == 0){
            System.out.println("Point lies at Origin.");
        }
        else if(x == 0){
            System.out.println("Point lies on Y-axis");
        }
        else{
            System.out.println("Point lies on X-Axis.");
        }
        sc.close();
    }
    
}
