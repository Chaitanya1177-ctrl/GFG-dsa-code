class Solution {
    public boolean canPair(List<Integer> arr, int k) {
        // code here.Ha
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int i=0;i<arr.size();i++){
            int rem=arr.get(i)%k;
            if(rem<0)rem+=k;
            ss.put(rem,ss.getOrDefault(rem,0)+1);
            
            
        }
        for(int a:ss.keySet()){
            int fr=ss.get(a);
            if(a==0){
                if(fr%2!=0)return false;
            }
            else if(2*a==k){
                if(fr%2!=0)return false;
            }
            else{
                int com=ss.getOrDefault(k-a,0);
                if(fr!=com)return false;
            }
        }
        return true;
    }
}
