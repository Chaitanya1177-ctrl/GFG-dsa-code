class Solution {
    public ArrayList<Integer> mergeArrays(int[][] mat) {
        // Code here
        
        ArrayList<Integer>ss=new ArrayList<>();
        for(int n[]:mat){
            for(int nn:n){
            ss.add(nn);
        }
        }
        Collections.sort(ss);
        return ss;
    }
}