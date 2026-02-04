public class OrderAgnosticBS {
    public static void main(String[] args) {
        // int[] arr = {-15, -3, 30, 49, 53, 69, 85, 94, 100};
        int[] arr = {95, 92, 60, 55, 45,30,  22, 18, 10};
        int target = 30;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // find the middle element

            // int mid = (start + end ) / 2; // might be possible that (start+end) / 2
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]){
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]){
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }



        }
        return -1;
    }
}
