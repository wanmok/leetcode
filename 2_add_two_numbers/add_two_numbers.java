/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        ListNode c1 = l1, c2 = l2;
        
        int carry = 0;
        while (c1 != null || c2 != null) {
            int sum = (c1 != null ? c1.val : 0) + (c2 != null ? c2.val : 0) + carry;
            if (sum > 9) carry = 1;
            else carry = 0;
            sum %= 10;
            curr.next = new ListNode(sum);
            curr = curr.next;
            c1 = c1 != null ? c1.next : null;
            c2 = c2 != null ? c2.next : null;
        }
        if (carry != 0) curr.next = new ListNode(1);
        
        return dummy.next;
    }
}