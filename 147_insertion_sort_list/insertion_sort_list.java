/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;
        
        while (prev != null && prev.next != null) {
            ListNode curr = dummy;
            while (curr.next != prev.next && curr.next.val <= prev.next.val)
                curr = curr.next;
            if (curr.next != prev.next) {
                ListNode temp = prev.next.next;
                prev.next.next = curr.next;
                curr.next = prev.next;
                prev.next = temp;
            } else prev = prev.next;
        }
        
        return dummy.next;
        
    }
}