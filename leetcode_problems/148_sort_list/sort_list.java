/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // a very classic merge sort problem
    
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        // this approach to fast cut the list apart
        // is important
        ListNode prev = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null; // avoid infinite loop
        
        ListNode l1 = sortList(head);
        ListNode l2 = sortList(slow);
        
        return merge(l1, l2);
    }
    
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            
            current = current.next;
        }
        
        current.next = l1 == null ? l2 : l1;
        
        return (result.next);
    }
}