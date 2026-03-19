//Take three numbers and print the median value (neither maximum nor minimum). 
import java.util.Scanner;
public class FindMedianOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max, min;

        // find max
        if(a >= b && a >= c){
            max = a;
        } else if(b >= a && b >= c){
            max = b;
        } else {
            max = c;
        }

        // find min
        if(a <= b && a <= c){
            min = a;
        } else if(b <= a && b <= c){
            min = b;
        } else {
            min = c;
        }

        int median = a + b + c - max - min;

        System.out.println("Median value is: " + median);

        sc.close();
    }
}

