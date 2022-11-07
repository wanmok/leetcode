/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode p1 = dummy, p2 = null;
        while (p1 != null && p1.next != null && p1.next.val < x)
            p1 = p1.next;
        
        if (p1 == null) return head;
        
        p2 = p1;
        while (p2 != null && p2.next != null) {
            if (p2.next.val < x) {
                ListNode temp = p2.next.next;
                p2.next.next = p1.next;
                p1.next = p2.next;
                p2.next = temp;
                p1 = p1.next;
            } else p2 = p2.next; // [3, 1, 2] 3
        }
        
        return dummy.next;
    }
}