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
        // constraints are important in simpliying solutions
        
        if (root == null) return ;
        
        TreeLinkNode prev = root, curr = root;
        while (prev.left != null) { // consider the constraints
            // this idea is pretty interesting
            // see how the algorithm go through the whole tree
            curr.left.next = curr.right;
            if (curr.next != null) {
                curr.right.next = curr.next.left;
                curr = curr.next;
            } else {
                prev = prev.left;
                curr = prev;
            }
            
        }
    }
}