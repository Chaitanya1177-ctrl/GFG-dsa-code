import java.util.*;

class Solution {
    public static int leftElement(int[] arr) {

        Arrays.sort(arr);
        int n = arr.length;

        if (n % 2 == 1) {
            return arr[n / 2];        // odd length
        } else {
            return arr[(n / 2) - 1];  // even length
        }
    }
}
