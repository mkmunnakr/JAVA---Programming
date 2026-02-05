//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 36, 75, 89, -3, -45};
        int target = -45;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is  = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}