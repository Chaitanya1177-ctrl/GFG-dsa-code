/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    boolean ss(Node root,long min,long max){
        if(root==null)return true;
        if(root.data<=min || root.data>=max)return false;
        else return ss(root.left,min,root.data) && ss(root.right,root.data,max);
    }
    
    public boolean isBST(Node root) {
        // code here
       return ss(root,Long.MIN_VALUE,Long.MAX_VALUE) ;
        
    }
}