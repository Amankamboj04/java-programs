//Take a character and check if it is a letter, a digit, or neither. 
import java.util.Scanner;
public class CheckCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLetter(ch)) {
            System.out.println("Character is a Letter");
        } 
        else if (Character.isDigit(ch)) {
            System.out.println("Character is a Digit");
        } 
        else {
            System.out.println("Character is Neither Letter nor Digit");
        }

        sc.close();
    }
}
