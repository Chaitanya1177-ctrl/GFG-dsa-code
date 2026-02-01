class Solution {
    public int findSubarray(int[] arr) {
        // code here.
        int n=arr.length;
        int p[]=new int [n];
        int count=0;
        p[0]=arr[0];
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+arr[i];
        }
        HashMap<Integer,Integer>ss=new HashMap<>();
        ss.put(0,1);
        for(int i=0;i<n;i++){
            if(ss.containsKey(p[i])){
                count+=ss.get(p[i]);
            }
            ss.put(p[i],ss.getOrDefault(p[i],0)+1);
        }
        return count;    }
}
