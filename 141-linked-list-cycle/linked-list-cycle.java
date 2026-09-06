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
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode f = head.next,s = head;
        while(s!=f){
            if(f == null || f.next == null){
                return false;
            }
            f = f.next.next;
            s = s.next;
        }
        return true;
    }
}