/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        Node temp=head;
        Node prv=null;
        Node next=null;
        while(temp!=null){
            next=temp.next;
            temp.next=prv;
            prv=temp;
            temp=next;
            
        }
        return prv;
        
    }
}