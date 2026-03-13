class Solution {
    public boolean isBalanced(String s) {
        // code here
    
        Stack<Character>ss=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='[' || c=='{' ||c=='('){
                ss.push(c);
            }else{
                if(ss.isEmpty())return false;
                char top=ss.pop();
                if(c==']'&& top!='['  || c=='}' && top!='{' || c==')' && top!='(')return false;
            }
        }
        return ss.isEmpty();
    }
}
