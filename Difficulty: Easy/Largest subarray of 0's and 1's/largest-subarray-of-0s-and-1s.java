class Solution {
    public int maxLen(int[] arr) {
        // Your code her
        int n=arr.length;
        int maxl=0;
        
        int p[]=new int[n];
        p[0]=(arr[0]==0)?-1:1;
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+((arr[i]==0)?-1:1);
        }
        HashMap<Integer,Integer>mm=new HashMap<>();
        for(int j=0;j<n;j++){
            if(p[j]==0)maxl=j+1;
            
            if(mm.containsKey(p[j])){
                maxl=Math.max(maxl,j-mm.get(p[j]));
            }
            else
                mm.put(p[j],j);
            
        }
        return maxl;
        
    }
}