//Take three numbers and check if they can form a Pythagorean triplet. 
import java.util.Scanner;
public class PythagoreanTriplet {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
     System.out.println("Enter value of base:");
     int a=sc.nextInt();
      System.out.println("Enter value of parpendicular:");
     int b=sc.nextInt();
      System.out.println("Enter value of hypotanuse:");
     int c=sc.nextInt();
     int max;
     max=Math.max(a,(Math.max(b,c)));//For find maximum side
     int sum;
     if(max == a){
         sum=(b*b)+(c*c);
     }
     
     else if(max == b){
         sum=(a*a)+(c*c);
     }
     else{
         sum=(a*a)+(b*b);
     }
     if(sum == max*max){
         System.out.println("Pythagorean Triplet");
     }
     else{
         System.out.println("Not Pythagorean Triplet.");
     }
        sc.close();
    }
}