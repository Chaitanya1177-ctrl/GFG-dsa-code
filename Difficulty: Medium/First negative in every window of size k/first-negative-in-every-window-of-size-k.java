class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        
        // write code here
        int n=arr.length;
        List<Integer>res=new ArrayList<>();
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<k;i++){
            if(arr[i]<0){
                q.add(arr[i]);
            }
            
        }
       res.add(q.isEmpty()?0:q.peek());
        for(int i=k;i<n;i++){
            if(arr[i]<0){
                q.add(arr[i]);
        }
        if(!q.isEmpty() && arr[i-k]==q.peek()){
        q.poll();
        }
        
        res.add(q.isEmpty()?0:q.peek());
        
    }
    return res;
}
}