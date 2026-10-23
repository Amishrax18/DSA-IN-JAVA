/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }

        Node curr = head;

        while (curr != null) {
            if (curr.child != null) {
                Node next = curr.next;

                Node child = flatten(curr.child);

                curr.next = child;
                child.prev = curr;
                curr.child = null;

                while (curr.next != null) {
                    curr = curr.next;
                }

                curr.next = next;

                if (next != null) {
                    next.prev = curr;
                }
            }

            curr = curr.next;
        }

        return head;
    }
}