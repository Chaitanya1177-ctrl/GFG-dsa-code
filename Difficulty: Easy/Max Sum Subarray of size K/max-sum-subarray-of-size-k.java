class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        
        int sum=0;
        int n=arr.length;
        int max=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        max=sum;
        for(int i=k;i<n;i++){
            sum=sum+arr[i]-arr[i-k];
            max=Math.max(max,sum);
        }
        return max;
    }
}