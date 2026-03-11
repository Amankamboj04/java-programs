import java.util.Scanner;
class LargestNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a First Number:");
        int a=sc.nextInt();
        System.out.println("Enter a Second Number:");
        int b=sc.nextInt();
        if(a>b){
           System.out.println(a+" is Greater than "+b);
        }
        else{
          System.out.println(b+" is Greater than "+a+" .");

        }
        sc.close();    
    }
    
}