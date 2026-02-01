class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int right=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            right+=arr[i];
        }
        int left=0;
        for(int i=0;i<n;i++){
            right-=arr[i];
            if(right==left){
                return i;
            }
            left+=arr[i];
        }
        return -1;
    }
}
