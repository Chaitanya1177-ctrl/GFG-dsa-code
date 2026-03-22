/*
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    
    
    Node ss(int arr[],int left,int right){
        if(arr.length==0)return null;
        if(left>right)return null;
        int mid=left+(right-left)/2;
    Node nn=new Node(arr[mid]);
        nn.left=ss(arr,left,mid-1);
        nn.right=ss(arr,mid+1,right);
        return nn;
    }
    public Node sortedArrayToBST(int[] arr) {
        // code here
        if(arr.length==0)return null;
        return ss(arr,0,arr.length-1);
    }
}