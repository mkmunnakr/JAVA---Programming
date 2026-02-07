public class Floor {
    public static void main(String[] args) {
        int[] arr = {-15, -3, 30, 49, 53, 69, 85, 94, 100};
        int target = -16;
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    // return the index : greatest number <= target
    static int floor(int[] arr, int target) {


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
        return end;
    }
}
