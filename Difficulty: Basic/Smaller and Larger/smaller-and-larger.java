// User function Template for Java

class Solution {
    int[] getMoreAndLess(int[] arr, int target) {
        // code here
        int l=0;
        int g=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=target){
                l++;
    }if(arr[i]>=target){
        g++;
    }
        }
    return new int[]{l,g};
}
}