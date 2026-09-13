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
    public ListNode midPoint(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null){
            fast=fast.next;
            if(fast!=null){
                fast=fast.next;
                slow=slow.next;
            }
        }
        return slow;
    }
    public ListNode reverseLL(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {

        if(head==null){
            return true;
        }
        if(head.next==null){
            return true;
        }
        //mid nikalenge
        ListNode list2=midPoint(head);

        //list 1 ,list 2 me divide kr denge
        ListNode temp = head;
        while(temp.next!=list2){

            temp=temp.next;
        }
        temp.next=null;
        //doosri list ko reverse kr denge
        ListNode head2=reverseLL(list2);
        //compare karnege- list1 and list2 ko
        ListNode temp1=head;
        ListNode temp2=head2;

        while(temp1!=null && temp2!=null){
            if(temp1.val!=temp2.val){
                return false;

            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        //return karenge t or f
        return true;
    }
}