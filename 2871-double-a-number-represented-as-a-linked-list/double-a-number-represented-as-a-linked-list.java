/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode doubleIt(ListNode head) {
        int carry = solve(head);

        if (carry > 0) {
            head = new ListNode(carry, head);
        }

        return head;
    }

    public int solve(ListNode node) {
        if (node == null) {
            return 0;
        }

        int carry = solve(node.next);

        int sum = node.val * 2 + carry;
        node.val = sum % 10;

        return sum / 10;
    }
}
