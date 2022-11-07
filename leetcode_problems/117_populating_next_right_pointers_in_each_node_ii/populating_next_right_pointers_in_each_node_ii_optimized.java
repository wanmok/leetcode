/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode nextHead = null, prev = null, curr = root;
        
        while (curr != null) {
            while (curr != null) {
                if (curr.left != null) {
                    if (nextHead == null) nextHead = curr.left;
                    if (prev != null) {
                        prev.next = curr.left;
                        prev = null;
                    }
                    if (curr.right != null) curr.left.next = curr.right;
                    else prev = curr.left;
                }
                if (curr.right != null) {
                    if (nextHead == null) nextHead = curr.right;
                    if (prev != null) {
                        prev.next = curr.right;
                        prev = null;
                    }
                    prev = curr.right;
                }
                curr = curr.next;
            }
            curr = nextHead;
            
            prev = null;
            nextHead = null;
        }
    }
}