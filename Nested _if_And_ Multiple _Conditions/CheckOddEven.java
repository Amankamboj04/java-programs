import java.util.Scanner;

public class CheckOddEven {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int a = sc.nextInt();

        System.out.println("Enter second number:");
        int b = sc.nextInt();

        if(a % 2 == 0 && b % 2 == 0){
            System.out.println("Both numbers are even");
        }
        else if(a % 2 != 0 && b % 2 != 0){
            System.out.println("Both numbers are odd");
        }
        else{
            System.out.println("One number is even and the other is odd");
        }

        sc.close();
    }
}