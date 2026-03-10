import java.util.Scanner;
class SimpleInterest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in celcius:");
       int c=sc.nextInt();
        int f=(c * 9/5)+32;
System.out.println(c + " Celcius = " + f + " Fahrenheit");   
sc.close();
    }
}