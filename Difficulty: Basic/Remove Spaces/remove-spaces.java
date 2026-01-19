// User function Template for Java
class Solution {

    String modify(String s) {
        // your code here
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ')
            {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}