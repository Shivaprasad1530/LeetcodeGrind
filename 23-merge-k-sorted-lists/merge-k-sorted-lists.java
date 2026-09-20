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
    public ListNode mergeKLists(ListNode[] lists) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(ListNode list : lists){
            while(list != null){
                int n = list.val;
                if(map.containsKey(n)){
                    map.replace(n,map.get(n)+1);
                }else{
                    map.put(n,1);
                }
                list = list.next;
            }
        }
        
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int i = 0;
            int k = entry.getKey();
            int v = entry.getValue();
            while(i<v){
                curr.next = new ListNode(k);
                curr = curr.next;
                i++;
            }
        }
        return dummy.next;
    }
}