class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
        // code here
        
        ArrayList<Integer>rr=new ArrayList<>();
        rr.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            rr.add(rr.get(i-1)+arr[i]);
        }
        return rr;
        
        
    }
}