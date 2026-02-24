import java.util.*;

class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        
        ArrayList<Integer> ss = new ArrayList<>();
        int n = a.length;
        int m = b.length;
        
        int i = 0, j = 0;
        
        while (i < n && j < m) {
            
            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }
            
            if (a[i] < b[j]) {
                ss.add(a[i]);
                i++;
            } 
            else if (a[i] > b[j]) {
                ss.add(b[j]);
                j++;
            } 
            else {
                ss.add(a[i]);
                i++;
                j++;
            }
        }
        
        while (i < n) {
            if (i == 0 || a[i] != a[i - 1]) {
                ss.add(a[i]);
            }
            i++;
        }
        
        while (j < m) {
            if (j == 0 || b[j] != b[j - 1]) {   // ✅ fixed here
                ss.add(b[j]);
            }
            j++;
        }
        
        return ss;
    }
}