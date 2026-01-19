import java.util.*;

class Solution {
    int longestSubarrayDivK(int[] arr, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);   // base case

        long sum = 0;     // ✅ FIX: use long
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // normalize remainder for negatives
            int rem = (int)(((sum % k) + k) % k);

            if (map.containsKey(rem)) {
                maxLen = Math.max(maxLen, i - map.get(rem));
            } else {
                map.put(rem, i);
            }
        }

        return maxLen;
    }
}
