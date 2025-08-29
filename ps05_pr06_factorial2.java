import java.util.Scanner;

public class ps05_pr06_factorial2 {
    // find factorial using While loop
    public static void main(String[] args) {
        System.out.print("Enter the Number : ");
        int fact = 1;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while(i<=n){
            fact = fact * i ;
            i++;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
