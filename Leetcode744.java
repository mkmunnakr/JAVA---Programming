// 744. Find Smallest Letter Greater Than Target

public class Leetcode744 {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'j', 'x'};
        char target = 'b';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }

    // return the index of smallest char   > target
    static char nextGreatestLetter(char[] letters, char target) {

        // but what if the target is greater than the greatest number in the array
        if (target > letters[letters.length - 1]) {
            return letters[0];
        }
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            // find the middle element

            // int mid = (start + end ) / 2; // might be possible that (start+end) / 2
            int mid = start + (end - start) / 2;

            if (target < letters[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return letters[start % letters.length];
    }
}
