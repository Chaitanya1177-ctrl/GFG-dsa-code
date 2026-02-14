// User function Template for Java

/*
class pair  {
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}
*/

class Solution {
    public pair[] allPairs(int target, int arr1[], int arr2[]) {
     
        // Your code goes here
    List<pair>re=new ArrayList<>();
   HashMap<Integer,Integer>ss=new HashMap<>();
   for(int nn:arr2){
       ss.put(nn,ss.getOrDefault(nn,0)+1);
       
   }
   
   
    Arrays.sort(arr1);
    for(int nn:arr1){
        int diff=target-nn;
        if(ss.containsKey(diff)){
            int freq=ss.get(diff);
            // re.add(new pair(nn,diff))t;
            for(int i=0;i<freq;i++){
                re.add(new pair(nn,diff));
            }
            
        }
    }
    pair ans []=new pair[re.size()];
    // return re;
    for(int i=0;i<re.size();i++){
        ans[i]=re.get(i); 
    }
    return ans;
        
    }
}