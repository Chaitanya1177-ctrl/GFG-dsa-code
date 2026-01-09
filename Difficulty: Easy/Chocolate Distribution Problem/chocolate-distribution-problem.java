import java.util.*;

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {

        // If students are more than packets
        if (m > arr.size()) return -1;

        // Sort packets
        Collections.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        // Sliding window of size m
        for (int i = 0; i + m - 1 < arr.size(); i++) {
            int diff = arr.get(i + m - 1) - arr.get(i);
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }
}
