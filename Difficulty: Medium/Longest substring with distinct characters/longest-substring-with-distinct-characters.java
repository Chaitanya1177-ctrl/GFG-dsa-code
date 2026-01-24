class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int mlen=0;
        int start=0;
        HashMap<Character,Integer>ss=new HashMap<>();
        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            if(ss.containsKey(c)){
                start=Math.max(start,ss.get(c)+1);
                
            }
            ss.put(c,end);
            mlen=Math.max(mlen,end-start+1);
        }
        return mlen;
    }
}