import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        System.out.println("Taking Input Form the User");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String str  = sc.nextLine();

        System.out.print("Hello " + str + " have a Good day ! ");


    }
}
