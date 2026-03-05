// User function Template for Java

class Solution {
    public boolean checkDuplicates(int arr[]) {
        // Code here
        HashSet<Integer>ss=new HashSet<>();
        for(int a:arr){
            if(!ss.add(a)){
                return true;
            }
        }
        return false;
    }
}