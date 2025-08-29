public class MultiplicationTableSum {
    // Multiplication table of 8 in sum all numbers
    public static void main(String[] args) {
        int n = 8;
        int sum = 0;
        int i = 1;
        while(i<=10){
            sum = sum + n*i;
            i++;
        }
        System.out.println("Sum is " + sum);
    }
}
// Output - Sum is 440
