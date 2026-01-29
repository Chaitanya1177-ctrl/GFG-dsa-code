// User function Template for Java
class StringUtils {
    // Function to check if two strings are the same
    public static boolean areStringsSame(String s1, String s2) {
        // code here
        if(s1.length()!=s2.length()){
            return false;
            
        }
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i))return false;
        }
        return  true;
    }
}