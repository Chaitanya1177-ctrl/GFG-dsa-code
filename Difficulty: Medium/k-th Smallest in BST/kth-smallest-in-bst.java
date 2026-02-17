/*
class Node {
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
    
    int count=0;
    int asn=-1;
    void ss(Node root,int k){
        if(root==null)return ;
        ss(root.left,k);
        count++;
        if(count==k){
            asn=root.data;
            return ;
        }
        ss(root.right,k);
        
    }
    
    public int kthSmallest(Node root, int k) {
        // code here
        count=0;
        asn=-1;
        ss(root,k);
        return asn;
        
    }
}