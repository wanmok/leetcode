/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    // try to make it more concise...
    
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
        
        ListNode head = new ListNode(0);
        int sum = 0;
        while (!s1.isEmpty() || !s2.isEmpty()) {
            Integer i1 = s1.pollLast(), i2 = s2.pollLast();
            sum += (i1 != null ? i1 : 0) + (i2 != null ? i2 : 0);
            head.val = sum % 10;
            ListNode n = new ListNode(sum / 10);
            n.next = head;
            head = n;
            sum /= 10;
        }
        
        return head.val == 0 ? head.next : head;
    }
}