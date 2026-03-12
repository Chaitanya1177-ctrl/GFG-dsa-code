class Solution {
    public static int getMaxArea(int arr[]) {
        // code here
     
     int n=arr.length;
     int left[]=new int [n];
     int right[]=new int[n];
     Stack<Integer>ss=new Stack<>();
     for(int i=0;i<n;i++){
         while(!ss.isEmpty() && arr[ss.peek()]>=arr[i]){
             ss.pop();
         }
         if(ss.isEmpty()){
             left[i]=-1;
         }else{
             left[i]=ss.peek();
         }
         ss.push(i);
     }
     ss.clear();
      for(int i=n-1;i>=0;i--){
         while(!ss.isEmpty() && arr[ss.peek()]>=arr[i]){
             ss.pop();
         }
         if(ss.isEmpty()){
             right[i]=n;
         }else{
             right[i]=ss.peek();
         }
         ss.push(i);
     }
     int ans=0;
     for(int i=0;i<n;i++ ){
         int widht=right[i]-left[i]-1;
         int aa=arr[i]*widht;
         
         ans=Math.max(ans,aa);
     }
     return ans;
     
    }
}
