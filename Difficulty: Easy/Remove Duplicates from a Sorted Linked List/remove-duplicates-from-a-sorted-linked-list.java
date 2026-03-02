/*
class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

class Solution {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        // Your code here
        Node prv=head;
        Node curr=head.next;
        while(curr!=null){
            if(prv.data==curr.data){
                prv.next=curr.next;
                curr=curr.next;
            }else{
                prv=curr;
                curr=curr.next;
            }
        }
        return head;
    }
}