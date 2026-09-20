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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode d = new ListNode(0);
        ListNode curr = d;
        ListNode l = list1, r = list2;
        while(l!=null && r!= null){
            if(l.val<=r.val){
                curr.next = l;
                l = l.next;
            }
            else{
                curr.next = r;
                r = r.next;
            }
           curr = curr.next;
        }
        while(l!=null){
            curr.next = l;
            l = l.next;
            curr = curr.next;
        }
        while(r!=null){
            curr.next = r;
            r = r.next;
            curr = curr.next;
        }
        return d.next;
    }
}