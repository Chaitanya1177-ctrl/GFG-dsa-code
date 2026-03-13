class Solution {
    static int maxLength(String s) {
        // code here
        int max=0;
        Stack<Integer>ss=new Stack<>();
        ss.push(-1);
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                ss.push(i);
            }else{
                ss.pop();
                if(ss.isEmpty()){
                    ss.push(i);
                }else{
                    max=Math.max(max,i-ss.peek());
                }
            }
        }
        return max;
    }
}