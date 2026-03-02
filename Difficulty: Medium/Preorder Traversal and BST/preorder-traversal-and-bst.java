// User function Template for Java

class Solution {
    static int canRepresentBST(int arr[], int N) {
        // code here
        int root=Integer.MIN_VALUE;
        Stack<Integer>ss=new Stack<>();
        for(int val:arr){
            if(val<root)return 0;
            while(!ss.isEmpty() && val>ss.peek()){
                root=ss.pop();
            }
            ss.push(val);
        }
        return 1;
    }
}