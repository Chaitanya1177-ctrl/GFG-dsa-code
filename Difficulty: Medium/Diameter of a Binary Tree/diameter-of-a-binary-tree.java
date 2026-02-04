/*
class Node {
    int data;
    Node left;
    Node right;ll
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
} */

class Solution {
    int max=0;
    int helper(Node root){
        if(root==null)return 0;
        
        int left=helper(root.left);
        int right=helper(root.right);
        max=Math.max(max,left+right);
        return 1+Math.max(left,right);
    }
    public int diameter(Node root) {
        // code here
        helper(root);
        return max;
    }
}