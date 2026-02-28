/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    void ss(Node root,ArrayList<Integer>rr){
        if(root==null)return;
        rr.add(root.data);
        ss(root.left,rr);
        ss(root.right,rr);
        
    }
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer>rr=new ArrayList<>();
        ss(root,rr);
        return rr;
        
    }
}