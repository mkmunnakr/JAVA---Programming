public class MountainArray {
    public static void main(String[] args) {

    }
   // https://leetcode.com/problems/peak-index-in-a-mountain-array/?envType=problem-list-v2&envId=array
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // Decending part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            }else {
                // Ascending Part of array
                start = mid + 1; // because we know that mid + 1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2
        // start and end are always trying to find max element in tne above 2 checks
        // hence , when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration at every time for start and end, they have the best possible ans till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are equal
    }

}
