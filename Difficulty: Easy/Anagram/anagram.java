class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length())return false;
        HashMap<Character,Integer>ss=new HashMap<>();
        for(char c:s1.toCharArray
        ()){
            ss.put(c,ss.getOrDefault(c,0)+1);
        }
        for(char c:s2.toCharArray()){
            ss.put(c,ss.getOrDefault(c,0)-1);
        }
        for(int val:ss.values()){
            if(val!=0)return false;
        }
        return true;
    }
}