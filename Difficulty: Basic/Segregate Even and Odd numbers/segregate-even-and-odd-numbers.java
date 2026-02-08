class Solution {
    void segregateEvenOdd(int arr[]) {
        // code here
        int temp[]=new int[arr.length];
   Arrays.sort(arr);
   int index=0;
   
   for(int i=0;i<arr.length;i++){
       if(arr[i]%2==0){
           temp[index]=arr[i];
           index++;
       }
   }
   for(int i=0;i<arr.length;i++){
       if(arr[i]%2!=0){
           temp[index]=arr[i];
           index++;
       }
   }
        for(int i=0;i<arr.length;i++){
            arr[i]=temp[i];
        }
    
    }
}