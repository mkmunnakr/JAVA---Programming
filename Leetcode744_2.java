public class Leetcode744_2 {
    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'j', 'x'};
        char target = 'b';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);
    }

    // return the index of smallest char   > target
    static char nextGreatestLetter(char[] letters, char target) {

        int low = 0, high = letters.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (letters[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return letters[low % letters.length]; // wrap-around
    }

}
