import java.util.Scanner;
public class TemperatureWeather {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a temperature value: ");

        int temp = sc.nextInt();

        if(temp <= 15){
            System.out.println("Today's weather is Cold.");
        }
        else if(temp > 15 && temp <= 22){
            System.out.println("Today's weather is Warm.");
        }
        else{
            System.out.println("Today's weather is Hot.");
        }

        sc.close();
    }
}