// User function Template for Java

class Solution {
    public int firstNonRepeating(int[] arr) {
        // Complete the function
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int a:arr){
            ss.put(a,ss.getOrDefault(a,0)+1);
        }
        
        for(int a:arr){
            if(ss.get(a)==1){
                return a;
            }
            
        }
        return 0;
    }
}
