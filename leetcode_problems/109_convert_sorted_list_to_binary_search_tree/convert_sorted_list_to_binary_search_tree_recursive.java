/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;
        
        return buildTree(head, null);
    }
    
    private TreeNode buildTree(ListNode head, ListNode tail) {
        if (head == tail) return null; // don't forget ending criteria
        
        ListNode slow = head, fast = head;
        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        TreeNode root = new TreeNode(slow.val);
        root.left = buildTree(head, slow);
        root.right = buildTree(slow.next, tail);
        
        return root;
    }
}