import java.util.Scanner;

public class CheckVowelConsonant {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a alphabet: ");
        char c = Character.toLowerCase(sc.next().charAt(0));

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
            System.out.println("Alphabet is Vowel.");
        }else{
            System.out.println("Alphabet is Consonant.");
        }

        sc.close();
    }
}