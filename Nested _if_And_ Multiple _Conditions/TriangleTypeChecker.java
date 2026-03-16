// If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene. 
import java.util.Scanner;
public class TriangleTypeChecker {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a side a:");
        int a=sc.nextInt();
        System.out.println("Enter a side b:");
        int b=sc.nextInt();
        System.out.println("Enter a side c:");
        int c=sc.nextInt();
        if(a+b>c && a+c>b && b+c>a){
            System.out.println("Valid Triangle.");
            if(a==b && b==c){
                System.out.println("Equilateral Triangle.");
            }
            else if(a==b || b==c ||a==c){
                System.out.println("Isosceles triangle.");
            }
            else if(a !=b && b!=c && c!=a){
                System.out.println("Scalene Triangle.");
            }
        }
        else{
            System.out.println("Not Valid triangle.");
        }
        sc.close();
    }
}
