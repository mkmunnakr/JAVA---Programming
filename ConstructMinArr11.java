import java.util.*;
public class ConstructMinArr11 {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input: Array ki length
            System.out.print("Array ka size enter karein: ");
            int n = sc.nextInt();

            List<Integer> nums = new ArrayList<>();
            System.out.println("Numbers enter karein (Primes):");
            for (int i = 0; i < n; i++) {
                nums.add(sc.nextInt());
            }

            // Solution object banakar function call karna
            Solution sol = new Solution();
            int[] result = sol.minBitwiseArray(nums);

            // Result output karna
            System.out.println("Minimum Bitwise Array: " + Arrays.toString(result));

            sc.close();
        }
    }

    class Solution {
        public int[] minBitwiseArray(List<Integer> nums) {
            int n = nums.size();
            int[] result = new int[n];

            for (int i = 0; i < n; i++) {
                int a = nums.get(i);

                if (a == 2) {
                    result[i] = -1;
                } else {
                    // Logic: Rightmost continuous 1s ke block mein
                    // sabse aakhri 1 ko 0 mein badalna
                    int firstZeroBit = ~a & (a + 1);
                    int bitToFlip = firstZeroBit >> 1;
                    result[i] = a ^ bitToFlip;
                }
            }
            return result;
        }
    }

