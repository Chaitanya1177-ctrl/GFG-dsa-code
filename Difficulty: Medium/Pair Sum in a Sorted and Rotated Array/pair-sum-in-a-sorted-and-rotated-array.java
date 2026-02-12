
class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        HashMap<Integer,Integer>ss=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int diff=target-arr[i];
            if(ss.containsKey(diff)){
                return true;
            }
            ss.put(arr[i],i);
        }
        return false;
    }
}
