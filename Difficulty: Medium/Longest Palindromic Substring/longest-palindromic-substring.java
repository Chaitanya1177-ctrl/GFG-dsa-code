class Solution {
    int max=0, ss=0, e=0;
    
    public boolean ss(String s,int i,int j){
        while(i<j){
            char c1=s.charAt(i);
            char c2=s.charAt(j);
            if(c1!=c2)return false;
            i++;
            j--;
        }
        return true;
    }
    public String getLongestPal(String s) {
        // code here
        
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++ ){
                if(ss(s,i,j)==true){
                    if(j-i+1>max){
                        max=j-i+1;
                        ss=i;
                        e=j;
                    }
                }
            }
            
           
    } return s.substring(ss,e+1);
}
}