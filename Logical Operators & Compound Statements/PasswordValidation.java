//Take a password string and check basic rules (length ≥ 8 and contains at least one digit). 
import java.util.Scanner;
class PasswordValidation{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter a password:");
        String password=sc.nextLine();
        if(password.length() >= 8 && password.matches(".*\\d.*")){
            System.out.println("Password is valid.");
        }
        else{
             System.out.println("Invalid password. Must be at least 8 characters and contain a digit.");

        }
        
        sc.close();
    }
}