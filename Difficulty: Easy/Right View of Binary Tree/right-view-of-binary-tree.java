/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        // code here
        ArrayList<Integer>ss=new ArrayList<>();
        ss(root,0,ss);
        return ss;
    }
    void ss(Node root,int level,ArrayList<Integer>ans){
        if(root==null)return ;
        if(level==ans.size()){
            ans.add(root.data);
        }
        ss(root.right,level+1,ans);
        ss(root.left,level+1,ans);
    }
}