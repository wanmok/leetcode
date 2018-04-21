/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode p1, p2, prev, curr;
        
        if (head == null || head.next == null)
            return (head);
        
        p1 = head;
        p2 = head.next;
        
        head = p2;
        p1.next = p2.next;
        p2.next = p1;
        
        prev = p1;
        curr = p1.next;
        
        while (curr != null) {
            if (p2 == null) {
                p2 = curr;
                
                prev.next = p2;
                p1.next = p2.next;
                p2.next = p1;
                
                prev = p1;
            } else {
                p1 = curr;
                p2 = null;
            }
            
            curr = p1.next;
        }
        
        if (p2 == null) {
            prev.next = p1;
        }
        
        return (head);
    }
}