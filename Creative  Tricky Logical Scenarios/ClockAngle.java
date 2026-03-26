//Take time (hours and minutes) and print the smaller angle between the hour and minute hands. 
import java.util.Scanner;

public class ClockAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        // Convert hour to 12-hour format
        hour = hour % 12;

        double hourAngle = (hour * 30) + (minute * 0.5);
        double minuteAngle = minute * 6;

        double angle = Math.abs(hourAngle - minuteAngle);
        angle = Math.min(angle, 360 - angle);

        System.out.println("Smaller Angle: " + angle);
        sc.close();
    }
}