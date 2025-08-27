import java.util.Scanner;
//multiplication table for given number
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<11; i++){
            System.out.println(n + " * " + i + " = " + i*n);
        }
    }
}
