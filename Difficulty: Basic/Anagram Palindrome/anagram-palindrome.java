class Sol {
    int isPossible(String S) {
        // your code herear
        HashMap<Character,Integer>ss=new HashMap<>();
        for(char s:S.toCharArray()){
            ss.put(s,ss.getOrDefault(s,0)+1);
        }
        int oldcount=0;
        for(int i:ss.values()){
            if(i%2!=0)oldcount++;
        }
        if(oldcount<=1)return 1;
        else{
            return 0;
        }
        
    }
}