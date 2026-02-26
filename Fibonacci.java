public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i <= 11; i++) {
            System.out.println(fibonacciFormula(i));
        }
    }

    static int fibonacciFormula(int n) {
        return (int)((Math.pow(((1 + Math.sqrt(5)) / 2), n) - Math.pow(((1 - Math.sqrt(5))/2),n)) / Math.sqrt(5));
    }

    static int fibo(int n) {
        // base condition
        if ( n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
