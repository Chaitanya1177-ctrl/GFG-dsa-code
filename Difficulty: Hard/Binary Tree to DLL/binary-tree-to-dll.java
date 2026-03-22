/*
class Node {
    int data;
    Node left, right;

    Node() {
        this.data = 0;
        this.left = this.right = null;
    }

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}
*/
class Solution {
    Node prv=null;
    Node head=null;
    Node bToDLL(Node root) {
        // code here
        
        ss(root);
        return head;
    }
    void ss(Node root){
        if(root==null)return;
        ss(root.left);
        if(prv==null){
            head=root;
            
        }
        else{
            root.left=prv;
            prv.right=root;
        }
        prv=root;
        ss(root.right);
    }
}