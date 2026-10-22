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
    public ListNode reverseKGroup(ListNode head, int k) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;

        }
        if(len<k){
            return head;
        }
        ListNode curr=head;
        ListNode prev=null;
        //reverse first k nodes of ll

        for(int i=1;i<=k;i++){
            ListNode forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }

        //remaining list ko recursion se solve kra lo
        ListNode recursionAnsKaHead= reverseKGroup(curr,k);
        //join both list
        head.next=recursionAnsKaHead;
        //ll is reversed as per questions demand
        return prev;
    }
}