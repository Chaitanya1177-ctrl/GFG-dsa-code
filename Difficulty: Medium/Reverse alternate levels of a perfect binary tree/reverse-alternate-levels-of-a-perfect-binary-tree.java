/*
// A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}


*/
class Solution {
    static void reverseAlternate(Node root) {
        // code here()
        if(root==null)return;
        ss(root.left,root.right,0);
    }
    static void ss(Node left,Node right,int level){
        if(left==null || right==null)return ;
        if(level%2==0){
            int temp=left.data;
            left.data=right.data;
            right.data=temp;
            
        }
        ss(left.left,right.right,level+1);
        ss(left.right,right.left,level+1);
    }
}