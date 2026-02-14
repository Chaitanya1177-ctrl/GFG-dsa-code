// User function Template for Java

class Solution {
    public static long countKdivPairs(int arr[], int n, int k) {
        // code here
        long count=0;
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int  i=0;i<n;i++){
            int rem=arr[i]%k;
            if(rem<0){
                rem+=k;
            }
            int remm=(k-rem)%k;
            if(ss.containsKey(remm)){
                count+=ss.get(remm);
            }
            ss.put(rem,ss.getOrDefault(rem,0)+1);
        }
        return count;
    }
}