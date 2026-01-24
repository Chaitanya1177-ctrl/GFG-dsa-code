class Solution {
   
        //  code here
public int atmosk(String s,int k){
int start=0;
int invalid=0;
        if (k < 0) return 0;
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
                
            }
            invalid+=end-start+1;
        }
        return invalid;
    }
     public int countSubstr(String s, int k) {
         return atmosk(s,k)-atmosk(s,k-1);
     }
    
}