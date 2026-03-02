class Solution {
    public Pair<Node, Node> splitList(Node head) {

        if (head == null)
            return new Pair<>(null, null);

        Node slow = head;
        Node fast = head;

        // Correct condition for circular list
        while (fast.next != head && fast.next.next != head) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // If even number of nodes
        if (fast.next.next == head) {
            fast = fast.next;
        }

        Node head1 = head;
        Node head2 = slow.next;

        // Make first half circular
        slow.next = head1;

        // Make second half circular
        fast.next = head2;

        return new Pair<>(head1, head2);
    }
}