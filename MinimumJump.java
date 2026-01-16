public class MinimumJump {
    public static int minJumps(int[] arr) {
        if (arr.length <= 1) return 0;
        if (arr[0] == 0) return -1; // cannot move anywhere

        int jumps = 1;   // we start with one jump
        int maxReach = arr[0]; // farthest we can reach
        int steps = arr[0];    // steps we can still take

        for (int i = 1; i < arr.length; i++) {
            if (i == arr.length - 1) return jumps; // reached end

            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;

            if (steps == 0) {
                jumps++;
                if (i >= maxReach) return -1; // cannot move further
                steps = maxReach - i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 1, 4};
        System.out.println("Minimum jumps: " + minJumps(arr));
    }
}