class Solution {
    public static boolean checkRedundancy(String s) {
        // code here
        
        Stack<Character>ss=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==')'){
                char top=ss.peek();
                ss.pop();
                
                boolean f=true;
                while(!ss.isEmpty() && top!='('){
                    if(top=='+' || top=='-' || top=='/' || top=='*'){
                        f=false;
                    }
                    top=ss.peek();
                    ss.pop();
                }
                if(f==true)return true;
            }else{
                ss.push(c);
            }
            
        }
        return false;
    }
}
