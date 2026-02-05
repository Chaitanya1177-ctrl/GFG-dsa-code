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
} */

class Solution {
    int max=0;
    int ss(Node root){
        if(root==null)return 0;
        int left=ss(root.left);
        int right=ss(root.right);
        max=Math.max(max,left+right);
        return 1+ Math.max(left,right);
    }
    public int diameter(Node root) {
        // code here
        ss(root);
        return max;
        
    }
}