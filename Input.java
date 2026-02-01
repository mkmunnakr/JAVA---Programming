import javax.naming.PartialResultException;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println();
        System.out.println();
        // input using for loops
        System.out.print("Enter the array data : ");


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println();
        System.out.print("Output of Array : [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        System.out.print("Output of Array : [");
        // second type to print Array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("]");

        // Third type of array print toString(arr) method
        System.out.println(Arrays.toString(arr));
    }
}
