import java.util.Scanner;
// Sum first n number using while loop
public class NaturalNumSum {
    public static void main(String[] args) {
        System.out.print("Enter first n Number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
//        int i = 0 ;
//        while(i<n){
//            sum = sum + (i);
//            i+=2;
//       }
        for(int i=0; i<n; i=i+2){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
