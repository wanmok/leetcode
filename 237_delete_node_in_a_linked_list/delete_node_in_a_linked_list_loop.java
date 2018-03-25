/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // just write a silly version......
        ListNode current = node;
        ListNode previous = node;
        
        while (current.next != null) {
            current.val = current.next.val;
            previous = current;
            current = current.next;
        }
        previous.next = null;
    }
}