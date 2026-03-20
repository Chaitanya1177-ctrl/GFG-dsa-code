// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n=arr.length;
        int p[]=new int[n];
        p[0]=arr[0];
        int max=0;
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+arr[i];
        }
        HashMap<Integer,Integer>ss=new HashMap<>();
        ss.put(0,1);
        for(int i=0;i<n;i++){
            if(p[i]==k)max=Math.max(max,i+1);
            int val=p[i]-k;
            if(ss.containsKey(val)){
                max=Math.max(max,i-ss.get(val));
            }if(!ss.containsKey(p[i])){
                ss.put(p[i],i);
            }
        }
        return max;
        
    }
}
