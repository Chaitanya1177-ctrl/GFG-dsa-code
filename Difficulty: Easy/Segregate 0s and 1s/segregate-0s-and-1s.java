// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)zero++;
            
        }
        int index=arr.length-1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]!=0){
                arr[index--]=arr[i];
                
            }
            
        }
        for(int i=0;i<zero;i++){
            arr[i]=0;
        }
    }
}
