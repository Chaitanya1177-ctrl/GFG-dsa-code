// User function Template for Java

class Solution {
    int search(String text, String pat) {
        // code herein
        int n=text.length();
        int m=pat.length();
        for(int i=0;i<=n-m;i++){
            int j;
            for( j=0;j<m;j++){
                if(text.charAt(i+j)!=pat.charAt(j)){
                    break;
                }
            }
            if(j==m)return 1;
        }
        return 0;
        
    }
}