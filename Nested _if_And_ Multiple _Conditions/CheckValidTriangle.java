package Nested_if_And_Multiple_Conditions;
import java.util.Scanner;
public class CheckValidTriangle {
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
        }
        else{
            System.out.println("Not Valid triangle.");
        }
    }
    
}
