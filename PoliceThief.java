import java.util.*;

public class PoliceThief {
    public static int catchThieves(char[] arr, int k) {
        List<Integer> police = new ArrayList<>();
        List<Integer> thief = new ArrayList<>();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'P') police.add(i);
            else if (arr[i] == 'T') thief.add(i);
        }

        int i = 0, j = 0;
        while (i < police.size() && j < thief.size()) {
            if (Math.abs(police.get(i) - thief.get(j)) <= k) {
                count++;
                i++;
                j++;
            } else if (police.get(i) < thief.get(j)) {
                i++;
            } else {
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        char[] arr = {'P', 'T', 'T', 'P', 'T'};
        int k = 1;
        System.out.println("Maximum thieves caught: " + catchThieves(arr, k));
    }
}