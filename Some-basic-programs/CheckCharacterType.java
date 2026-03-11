import java.util.Scanner;
public class CheckCharacterType {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
      System.out.print("Enter a alphabet: ");
      char ch=sc.next().charAt(0);
      if(ch >='a' && ch <='z'){
          System.out.println("Lowecase letter.");
      }else if(ch >='A' && ch <='Z'){
            System.out.println("Uppercase letter.");
      }else if(ch >='0' && ch <='9'){
                System.out.println("Digit.");
      }else{
                      System.out.println("Special Symbol.");
      }
      
         sc.close();
    }
}
