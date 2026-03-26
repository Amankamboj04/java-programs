import java.util.Scanner;

public class CenturyFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = sc.nextInt();

        int century = (year + 99) / 100;

        String suffix;

        if (century % 10 == 1 && century % 100 != 11) {
            suffix = "st";
        } else if (century % 10 == 2 && century % 100 != 12) {
            suffix = "nd";
        } else if (century % 10 == 3 && century % 100 != 13) {
            suffix = "rd";
        } else {
            suffix = "th";
        }

        System.out.println(century + suffix + " century");
        sc.close();
    }
}