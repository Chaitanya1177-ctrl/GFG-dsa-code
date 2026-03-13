import java.util.*;

class Solution {

    static int mm(int height[]) {

        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];

        Stack<Integer> ss = new Stack<>();

        // Previous Smaller
        for (int i = 0; i < n; i++) {

            while (!ss.isEmpty() && height[ss.peek()] >= height[i]) {
                ss.pop();
            }

            if (ss.isEmpty())
                left[i] = -1;
            else
                left[i] = ss.peek();

            ss.push(i);
        }

        ss.clear();

        // Next Smaller
        for (int i = n - 1; i >= 0; i--) {

            while (!ss.isEmpty() && height[ss.peek()] >= height[i]) {
                ss.pop();
            }

            if (ss.isEmpty())
                right[i] = n;
            else
                right[i] = ss.peek();

            ss.push(i);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {
            int width = right[i] - left[i] - 1;
            int area = height[i] * width;
            ans = Math.max(ans, area);
        }

        return ans;
    }

    static int maxArea(int mat[][]) {

        int row = mat.length;
        int col = mat[0].length;

        int height[] = new int[col];
        int max = 0;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                if (mat[i][j] == 1)
                    height[j]++;
                else
                    height[j] = 0;
            }

            max = Math.max(max, mm(height));
        }

        return max;
    }
}