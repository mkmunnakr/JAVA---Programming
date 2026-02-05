import java.util.Arrays;

public class Max2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 45,3},
                {18, 48, 15},
                {78, 99, 34, 58},
                {14, 47}
        };

        int ans = max(arr); // format of return value {row, col}
        System.out.println(ans);
    }
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr ) {
            for ( int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
