import java.util.Scanner;

public class CheckPrimeNum {
    static int isPrime(int n){
        if(n <= 1){
            return 0;
        }
        for (int i = 2; i*i <= n; i++){
            if(n % i==0) return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();

        if (isPrime(n) == 1) {
            System.out.println(n + " is a Prime Number.");
        } else {
            System.out.println(n + " is not  a Prime Number.");
        }
        sc.close();
    }
}
