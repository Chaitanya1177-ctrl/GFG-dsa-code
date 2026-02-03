// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder();
        HashSet<Character>ss=new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!ss.contains(c)){
                ss.add(c);
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
