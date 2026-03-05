public class SumofDigits {
    public static void main(String[] args) {
        int ans = sum(1234);
        System.out.println("Sum of Digits : " +ans);

        int ans2 = prod(1234);
        System.out.println("Product of Digits : " +ans2);
    }

    static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return (n%10) + sum(n/10);
    }

    static int prod(int n) {
        if (n%10 == n) {
            return n;
        }

        return (n%10) * prod(n/10);
    }
}
