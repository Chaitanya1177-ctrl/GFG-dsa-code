class Solution {
    public int longestKSubstr(String s, int k) {
        // code herent
        int start=0;
        int mlen=-1;
        HashMap<Character,Integer>ss=new HashMap<>();
        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            ss.put(c,ss.getOrDefault(c,0)+1);
            while(ss.size()>k){
                char f=s.charAt(start);
                ss.put(f,ss.get(f)-1);
                if(ss.get(f)==0){
                    ss.remove(f);
                }
                start++;
                // mlen=Math.max(mlen,end-start+1);
            }
            if(ss.size()==k){
             mlen=Math.max(mlen,end-start+1);
        }}
       
        return mlen;
        
        
    
}}