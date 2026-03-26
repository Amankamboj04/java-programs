//Take three numbers and check if they are in geometric progression. 
import java.util.Scanner;
public class CheckGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a != 0 && b != 0 && (b / a) == (c / b)) {
            System.out.println("In Geometric Progression");
        } else {
            System.out.println("Not in Geometric Progression");
        }
        sc.close();
    }
}