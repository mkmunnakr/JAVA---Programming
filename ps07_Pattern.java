import java.util.Scanner;
//Multiplication Table Using Methods
// Pattern Printing
public class ps07_Pattern {
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n",n, i, n*i );
        }
    }

    static void pattern(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("Multiplication Table  of 7 is    : " );
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        multiplication(7);
        System.out.println();
        System.out.println();
        System.out.println("Pattern is ");
        pattern(4);
    }
//         Pattern is 
//        *
//        * *
//        * * *
//        * * * *

}
