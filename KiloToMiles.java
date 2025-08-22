import java.util.Scanner;

public class KiloToMiles {
    public static void main(String[] args) {
        System.out.println("Enter Distance in Kilometer : ");
        Scanner sc = new Scanner(System.in);
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        //1 kilometer = 0.621371 miles
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

    }
}
