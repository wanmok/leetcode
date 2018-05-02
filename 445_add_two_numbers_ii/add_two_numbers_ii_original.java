/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // using stack is interesting
    // tedious code....
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<Integer> s1 = new LinkedList<>();
        Deque<Integer> s2 = new LinkedList<>();
        
        ListNode c1 = l1, c2 = l2;
        while (c1 != null || c2 != null) {
            if (c1 != null) {
                s1.offerLast(c1.val);
                c1 = c1.next;
            }
            if (c2 != null) {
                s2.offerLast(c2.val);
                c2 = c2.next;
            }
        }
        
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        if (s1.size() < s2.size()) {
            Deque<Integer> temp = s1;
            s1 = s2;
            s2 = temp;
        }
        
        int carry = 0;
        while (!s1.isEmpty()) {
            Integer left = s1.pollLast(), right = s2.pollLast();
            Integer sum = left + (right != null ? right : 0) + carry;
            if (sum > 9) carry = 1;
            else carry = 0;
            ListNode n = new ListNode(sum % 10);
            n.next = curr.next;
            curr.next = n;
        }
        if (carry != 0) {
            ListNode n = new ListNode(1);
            n.next = curr.next;
            curr.next = n;
        }
        
        return dummy.next;
    }
}