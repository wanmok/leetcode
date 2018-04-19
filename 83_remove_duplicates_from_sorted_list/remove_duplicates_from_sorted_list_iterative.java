/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return (head);
        
        ListNode curr = head;
        ListNode prev = head;
        
        int curr_num = head.val;
        curr = curr.next;
        while (curr != null) {
            if (curr.val == curr_num) {
                prev.next = curr.next;
            } else {
                prev = curr;
                curr_num = curr.val;
            }
            curr = curr.next;
        }
        
        return (head);
    }
}