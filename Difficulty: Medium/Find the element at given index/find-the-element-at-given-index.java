

class Solution {
    int findElement(int[] arr, int n, int x, int[][] ranges, int k) {
        // code here
        for(int i=k-1;i>=0;i--){
            int l=ranges[i][0];
            int r=ranges[i][1];
            if(x>=l && x<=r){
                if(x==l){
                    x=r;
                }else{
                    x=x-1;
                }
            }
        }
        return arr[x];
    }
}
