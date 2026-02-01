class Solution {
    int longestSubarrayDivK(int[] arr, int k) {

        int n = arr.length;
        long[] p = new long[n];   // 🔑 long prefix sum
        p[0] = arr[0];

        int maxlen = 0;

        HashMap<Integer, Integer> ss = new HashMap<>();
        ss.put(0, -1);

        // build prefix sum
        for (int i = 1; i < n; i++) {
            p[i] = p[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            int val = (int)(p[i] % k);  // mod after long sum
            if (val < 0) val += k;

            if (ss.containsKey(val)) {
                maxlen = Math.max(maxlen, i - ss.get(val));
            } else {
                ss.put(val, i);
            }
        }

        return maxlen;
    }
}
