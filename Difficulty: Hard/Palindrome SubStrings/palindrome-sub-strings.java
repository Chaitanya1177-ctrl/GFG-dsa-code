class Solution {
    public int countPS(String s) {
        // code heref
        int count=0;
        for(int i=0;i<s.length();i++){
            count+=ss(s,i-1,i+1);
            count+=ss(s,i,i+1);
        }
        return count;
        
    }
    public int ss(String s,int l,int r){
        int count=0;
        while(l>=0&& r<s.length() && s.charAt(l)==s.charAt(r) ){
            count++;
            l--;
            r++;
        }
        return count;
    }
}