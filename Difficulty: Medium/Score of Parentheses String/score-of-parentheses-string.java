class Solution {
    public int scoreOfParentheses(String s) {
        // code here
        
    Stack<Integer>ss=new Stack<>();
    ss.push(0);
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        if(c=='('){
            ss.push(0);
        }else{
            int val=ss.pop();
            
            int score=Math.max(2*val,1);
            ss.push(ss.pop()+score);
        }
    }
    return ss.pop();
    }
}