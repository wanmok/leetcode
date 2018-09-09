/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // @COMPANY Facebook
    // @KEYWORD Math
    // @NOTE carry and the maximum of adding two numbers is the key.
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode curr = dummy;
        int carry = 0;
        
        while (p1 != null || p2 != null) {
            int num1 = p1 != null ? p1.val : 0;
            int num2 = p2 != null ? p2.val : 0;
            int sum = carry + num1 + num2;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            p1 = p1 != null ? p1.next : null;
            p2 = p2 != null ? p2.next : null;
            curr = curr.next;
        }
        
        if (carry != 0)
            curr.next = new ListNode(1);
        
        return dummy.next;
    }
}