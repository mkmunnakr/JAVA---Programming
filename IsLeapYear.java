import java.util.Scanner;

public class IsLeapYear {
    // Leap Year or Not
    public static void main(String[] args) {
        System.out.print("Enter The Year : ");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt() ;
        if((year%4==0 && year%100!=0) || (year%400==0)) {
            System.out.print(year);
            System.out.println(" is Leap Year ");
        }
        else {
            System.out.print(year);
            System.out.println(" is not Leap Year ");
        }
    }
}
