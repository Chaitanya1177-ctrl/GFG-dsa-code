class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {

        int n = arr.length;
        int wstart = 0;
        int wend = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        while (wend < n) {

            // expand window
            sum += arr[wend];

            // shrink window while sum > x
            while (sum > x) {
                minLen = Math.min(minLen, wend - wstart + 1);
                sum -= arr[wstart];
                wstart++;
            }

            wend++;
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
