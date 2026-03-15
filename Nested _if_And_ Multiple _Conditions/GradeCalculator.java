package nested_if_and_multiple_conditions;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks:");
        int mark=sc.nextInt();
        if(mark >=90){
            System.out.println("You got Grade 'A'.");
        }
        else if(mark >= 80){
            System.out.println("You got grade 'B'.");
        }
        else if( mark >=70){
            System.out.println("You got grade 'c'.");
        }
        else if(mark >= 60){
            System.out.println("You got grade 'D'.");
        }
        else{
            System.out.println("You got grade 'F'.");
        }
    }
}
