import java.util.Scanner;

public class ps04_pr04Switch {
    // switch case print Weeks name
    public static void main(String[] args) {
        System.out.print("Enter number 1 to 7 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt() ;
        switch(num) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            default :
                System.out.println("Sunday");
        }
    }
}
