class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length())return false;
    HashMap<Character,Integer>ss=new HashMap<>();
    for(char c1:s1.toCharArray()){
        ss.put(c1,ss.getOrDefault(c1,0)+1);
    }
    for(char c2:s2.toCharArray()){
        ss.put(c2,ss.getOrDefault(c2,0)-1);
    }
    for(int val:ss.values()){
        if(val!=0){
            return false;
        }
    }
    return true;
    }
}