//Take three numbers and check if they are in arithmetic progression
import java.util.Scanner;
public class CheckAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((b - a) == (c - b)) {
            System.out.println("In Arithmetic Progression");
        } else {
            System.out.println("Not in Arithmetic Progression");
        }
        sc.close();
    }
}