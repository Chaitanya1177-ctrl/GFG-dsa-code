class Solution {
    public static int countSubstring(String s) {
        // code here
        int count=0;
        int start=0;
        HashMap<Character,Integer>ss=new HashMap<>();
        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            ss.put(c,ss.getOrDefault(c,0)+1);
            while(ss.size()==3){
                count+=s.length()-end;
                char f=s.charAt(start);
                ss.put(f,ss.get(f)-1);
                if(ss.get(f)==0){
                    ss.remove(f);
                }
                start++;
            }
        }
        return count;
    }
}
