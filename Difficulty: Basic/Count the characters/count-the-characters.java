// User function Template for Java

class Sol {
    int getCount(String S, int N) {
        // your code herea..
        int count=0;
        HashMap<Character,Integer>ss=new HashMap<>();
        ss.put(S.charAt(0),1);
        for(int i=1;i<S.length();i++){
            char c=S.charAt(i);
            char p=S.charAt(i-1);
            if(c!=p){
                ss.put(c,ss.getOrDefault(c,0)+1);
            }
        }
        for(int val:ss.values()){
            if(val==N)count++;
        }
        return count++;
        
    }
}