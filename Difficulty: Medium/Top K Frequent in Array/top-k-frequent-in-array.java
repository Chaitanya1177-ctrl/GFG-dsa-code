import java.util.*;

class Solution {
    public ArrayList<Integer> topKFreq(int[] arr, int k) {

        HashMap<Integer,Integer> ss = new HashMap<>();

        for(int a : arr){
            ss.put(a, ss.getOrDefault(a,0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>(ss.keySet());

     Collections.sort(list,(a,b)->{
    if(ss.get(a).equals(ss.get(b))){
        return b - a;   // larger number first
    }
    return ss.get(b) - ss.get(a); // higher frequency first
});

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0;i<k;i++){
            ans.add(list.get(i));
        }

        return ans;
    }
}