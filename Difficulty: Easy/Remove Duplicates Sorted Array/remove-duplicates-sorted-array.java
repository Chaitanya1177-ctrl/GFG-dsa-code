class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer>ss=new ArrayList<>();
        ss.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                ss.add(arr[i]);
            }
        }
        return ss;
    }
}
