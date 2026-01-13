class Solution {
    public int countSubarray(int[] arr) {
        // code here
        
        int count=0;
        int n=arr.length;
        int p[]=new int[n];
        p[0]=(arr[0]==0)?-1:1;
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+((arr[i]==0)?-1:1);
        }
        HashMap<Integer,Integer>mm=new HashMap<>();
        mm.put(0,1);
        for(int j=0;j<n;j++){
            // if(p[j]==0)count++;
            if(mm.containsKey(p[j])){
                count+=mm.get(p[j]);
            }
            mm.put(p[j],mm.getOrDefault(p[j],0)+1);
        }
        return count;
    }
}