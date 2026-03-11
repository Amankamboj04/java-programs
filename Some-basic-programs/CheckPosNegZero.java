import java.util.Scanner;
public class CheckPosNegZero {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
         if(sc.hasNextInt()){
                     int num=sc.nextInt();
        if(num < 0){
            System.out.println(num+" is Negative.");
        }else if(num == 0){
            System.out.println("Your number is zero.");
        }else{
            System.out.println(num+" is Positive. ");
        }
    }else{
            System.out.println("Enter a valid number.");
         }
         sc.close();
    }
    
}
