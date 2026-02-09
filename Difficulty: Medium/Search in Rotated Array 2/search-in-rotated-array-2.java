class Solution {
    public boolean search(int[] arr, int key) {
        // code here
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key)return true;
        }
        return false;
        
    }
}
