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
    public void reorderList(ListNode head) {
        if(head == null || head.next ==null){
            return;
        }
        ListNode f = head,s = head;
        while(f!=null && f.next!= null){
            f = f.next.next;
            s = s.next;
        }
        ListNode prev =null,curr = s, next1 = null;
        while(curr!=null){
            next1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next1;
        }
        ListNode first = head,rev = prev, temp = null;
        while(rev.next !=null){
           temp = first.next;
           first.next = rev;
           first =temp;

           temp = rev.next;
           rev.next = first;
            rev = temp;
        }
    }
}