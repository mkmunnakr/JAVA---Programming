import java.util.*;
public class MaximumNoOfWorkers {
    public int minMen(int arr[]) {
            int n = arr.length;
            List<int[]> intervals = new ArrayList<>();

            // Build intervals
            for (int i = 0; i < n; i++) {
                if (arr[i] != -1) {
                    int start = Math.max(0, i - arr[i]);
                    int end = Math.min(n - 1, i + arr[i]);
                    intervals.add(new int[]{start, end});
                }
            }

            // Sort by start
            intervals.sort((a, b) -> a[0] - b[0]);

            int workers = 0;
            int coveredTill = 0;
            int i = 0;

            // Greedy covering
            while (coveredTill < n) {
                int maxReach = coveredTill;
                while (i < intervals.size() && intervals.get(i)[0] <= coveredTill) {
                    maxReach = Math.max(maxReach, intervals.get(i)[1] + 1);
                    i++;
                }

                if (maxReach == coveredTill) return -1; // stuck, cannot cover further
                workers++;
                coveredTill = maxReach;
            }

            return workers;
        }
}
