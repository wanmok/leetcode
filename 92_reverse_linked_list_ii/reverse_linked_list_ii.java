/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy, start = prev.next, end = prev.next;
        
        for (int i = 0; i < m - 1; i ++)
            prev = prev.next;
        start = prev.next;
        end = prev.next;
        
        ListNode next = null;
        for (int i = 0; i < n - m + 1; i ++) {
            next = start.next;
            start.next = prev.next;
            prev.next = start;
            start = next;
        }
        end.next = next;
        return dummy.next;
    }
}