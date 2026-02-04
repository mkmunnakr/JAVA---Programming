//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-15, -3, 30, 49, 53, 69, 85, 94, 100};
        int target = 30;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element

            // int mid = (start + end ) / 2; // might be possible that (start+end) / 2
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}