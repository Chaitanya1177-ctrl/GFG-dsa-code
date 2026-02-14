// User function Template for Java

class Solution {
    public int TotalPairs(int[] nums, int k) {
        // Code here
        int count=0;
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int n:nums){
            ss.put(n,ss.getOrDefault(n,0)+1);
        }
        // int count=0;
        
        if(k==0){
            for(int fr:ss.values()){
                if(fr>1)count++;
            }
        }
        else{
            for(int ff:ss.keySet()){
                if(ss.containsKey(ff+k))count++;
            }
        }
        return count;
    }
}