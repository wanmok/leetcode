/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        
        ListNode head2 = head;
        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            count ++;
            curr = curr.next;
        }
        curr = head;
        for (int i = 1; i <= count / 2; i ++) {
            ListNode temp = curr.next;
            curr.next = head2;
            head2 = curr;
            curr = temp;
            head = curr;
        }
        if (count % 2 == 1) head = head.next;
        while (head != null) {
            if (head.val != head2.val) return false;
            head = head.next;
            head2 = head2.next;
        }
        return true;
        
    }
}