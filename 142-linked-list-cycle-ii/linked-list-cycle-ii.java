/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow =head;
        ListNode fast=head;
        //advamce both at diff speed
        //tab tak jab tak ye wapas na mile
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            
            //as soon as they meet
            //head again and move at the same speed
            if(slow==fast){
                while(head!=slow){
                    head=head.next;
                    slow=slow.next;
                }
                return slow;
            }
        }
        return null;
    }
}