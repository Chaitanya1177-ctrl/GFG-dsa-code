class Solution {
    String transform(String S) {

        StringBuilder result = new StringBuilder();

        int count = 1;
        char prev = Character.toLowerCase(S.charAt(0));

        for (int i = 1; i < S.length(); i++) {
            char curr = Character.toLowerCase(S.charAt(i));

            if (curr == prev) {
                count++;
            } else {
                result.append(count).append(prev);
                prev = curr;
                count = 1;
            }
        }

        // append last group
        result.append(count).append(prev);

        return result.toString();
    }
}
