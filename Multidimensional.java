import java.util.Arrays;
import java.util.Scanner;

public class Multidimensional {
    public static void main(String[] args) {
        /*
                123
                456
                789
        */
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];


        // input
        System.out.print("Enter the array data : ");
        for (int row = 0; row < arr.length;  row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
     // output
        System.out.println();
        System.out.println();
        System.out.println("Output of Array data 1st type : ");

        for (int row = 0; row < arr.length;  row++) {
            // for each column in every row
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println("Output of Array data 2nd type : ");

        for ( int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }

        System.out.println();
        System.out.println();
        System.out.println("Output of Array data 3rd type : ");

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
