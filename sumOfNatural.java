import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class sumOfNatural {
    static int sum(int a){
        if (a == 1){
            return 1;
        }
        else {
            return a + sum(a-1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum of First " + n + "Natural Number is : " + sum(n));
    }
}
