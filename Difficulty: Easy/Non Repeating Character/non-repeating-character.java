class Solution {
    public char nonRepeatingChar(String s) {
        // code here
        HashMap<Character,Integer>ss=new HashMap<>();
        for(char i:s.toCharArray()){
            ss.put(i,ss.getOrDefault(i,0)+1);
        }
        for(int  i=0;i<s.length();i++){
            if(ss.get(s.charAt(i))==1)return s.charAt(i);
        }
        return '$';
    }
}
