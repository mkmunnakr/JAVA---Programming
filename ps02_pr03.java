import java.util.Scanner;

public class ps02_pr03 {
  // Basic operator to check the number is greater than 8 or not
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt() ;
        System.out.println(a>8);
    }
}
