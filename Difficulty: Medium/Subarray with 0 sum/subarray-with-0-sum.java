class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        int n=arr.length;
        int pp[]=new int[n];
        pp[0]=arr[0];
        for(int i=1;i<n;i++){
            pp[i]=pp[i-1]+arr[i];
        }
        HashSet<Integer>mm=new HashSet<>();
        for(int j=0;j<n;j++){
            if(pp[j]==0)return true;
            if(mm.contains(pp[j]))return true;
            
            mm.add(pp[j]);
        }
        return false;
        
    }
}