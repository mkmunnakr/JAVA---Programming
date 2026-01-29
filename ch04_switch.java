import java.util.Scanner;

public class ch04_switch {
    public static void main(String[] args) {
        System.out.print("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>55) {
            System.out.println("Your ar experienced ");
        }
        else if(age > 46 ) {
            System.out.println("Your are semi-experienced ");
        }
        else if(age>36) {
            System.out.println("You are semi-semi-experienced ");
        }
        else {
            System.out.println("You are not experienced ");
        }
    }
}
