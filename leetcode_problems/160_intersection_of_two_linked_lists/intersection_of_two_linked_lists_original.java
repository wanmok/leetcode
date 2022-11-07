/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    // This is a O(mn) solution

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode l1 = headA, l2 = headB;
        ListNode dummyA = new ListNode(0), dummyB = new ListNode(0);
        dummyA.next = headA;
        dummyB.next = headB;
        while (l1 != null && l1.next != null)
            l1 = l1.next;
        while (l2 != null && l2.next != null)
            l2 = l2.next;
        if (l1 != l2)
            return null;
        ListNode c = l1;
        l1 = dummyA;
        l2 = dummyB;
        while (l1 != c || l2 != c) {
            if (l1.next == c && l2.next == c) {
                if (l1 == l2) {
                    c = l1;
                    l1 = dummyA;
                    l2 = dummyB;
                } else
                    return c;
            } else {
                if (l1.next != c) l1 = l1.next;
                if (l2.next != c) l2 = l2.next;
            }
        }
        return c;
    }
}