class Solution {
    int majorityElement(int arr[]) {
        // code here
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int i:arr){
            ss.put(i,ss.getOrDefault(i,0)+1);
        }
        int n=arr.length;
        for(int a:arr){
            if(ss.get(a)>n/2){
                return a;
            }
        }
        return -1;
        
    }
}