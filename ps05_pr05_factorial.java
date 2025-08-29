import java.util.Scanner;

public class ps05_pr05_factorial {
    // find factorial using for loop
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            fact = fact * i ;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
