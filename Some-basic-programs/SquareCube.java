import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int square = num * num;
        int cube = num * num * num;

        System.out.println("Square = " + square);
        System.out.println("Cube = " + cube);

        sc.close();
    }
}