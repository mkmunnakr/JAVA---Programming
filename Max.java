import com.sun.source.tree.ReturnTree;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,3,43,56,7,65};


        System.out.println(maxRange(arr, 1, 3));
    }
    static int maxRange(int[] arr, int start, int end) {
        int maxVal = arr[start];
            for (int i = 0; i <= end; i++) {
                if(arr[i] > maxVal) {
                    maxVal = arr[i];
                }
            }
        return maxVal;
    }
}
