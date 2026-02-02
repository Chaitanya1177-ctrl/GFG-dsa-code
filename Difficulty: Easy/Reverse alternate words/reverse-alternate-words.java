class Solution {
    String reverseAlternate(String s) {
        String[] arr = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1) {   // ✅ reverse ONLY odd index
                ans.append(new StringBuilder(arr[i]).reverse());
            } else {
                ans.append(arr[i]);
            }

            if (i < arr.length - 1) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}
