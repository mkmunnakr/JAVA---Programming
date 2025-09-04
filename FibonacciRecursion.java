public class FibonacciRecursion {
    // Fibonacci Series Using Recursion
    static int fibonacci(int n){
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        int a = 7;
        System.out.println("Fibonacci Series of number " + a + " is " + fibonacci(a));
    }
}
