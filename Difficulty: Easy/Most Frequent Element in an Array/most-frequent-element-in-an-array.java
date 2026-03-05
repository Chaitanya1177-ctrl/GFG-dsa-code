class Solution {
    public int mostFreqEle(int[] arr) {
        // code here#
        
        int ans=0;
        int max=0;
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int i:arr){
            ss.put(i,ss.getOrDefault(i,0)+1);
        }
        for(int a:ss.keySet()){
            int  f=ss.get(a);
            if(f>max ||  (f==max && a>ans)){
                max=f;
                ans=a;
                
            }
        }
        return ans;
    }
}