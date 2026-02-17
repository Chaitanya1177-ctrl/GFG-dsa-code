/*
class Node
{
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    // Function to find the least absolute difference between any node
    // value of the BST and the given integer.
    static int minDiff(Node root, int K) {
        // Write your code here
        int diff=Integer.MAX_VALUE;
        while(root!=null){
            diff=Math.min(diff,Math.abs(root.data-K));
            if(root.data==K){
                return 0;
            }
            if(root.data>K){
                root=root.left;
            }
            else{
                root=root.right;
            }
            
        }
        return diff;
        
    }
}