/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // dummy technique is very useful to treat the head node
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        
        // at first I was stuck there
        // as I couldn't find a way to maintain the relationship
        for (int i = 1; i <= n + 1; i ++) {
            fast = fast.next;
        }
        
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return dummy.next;
    }
}