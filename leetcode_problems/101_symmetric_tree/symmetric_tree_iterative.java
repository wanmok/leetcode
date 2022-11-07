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
    public boolean isSymmetric(TreeNode root) {
        Deque<TreeNode> q = new LinkedList<>();
        
        if (root == null)
            return (true);
        
        if (root.left == null || root.right == null) {
            if (root.left == root.right) 
                return (true);
            else
                return (false);
        } else {
            q.offerLast(root.left);
            q.offerLast(root.right);
        }
        
        while (! q.isEmpty()) {
            TreeNode left = q.pollFirst();
            TreeNode right = q.pollFirst();
            
            if (left.val != right.val)
                return (false);
            
            if (left.right == null || right.left == null) {
                if (left.right != right.left)
                    return (false);
            } else {
                q.offerLast(left.right);
                q.offerLast(right.left);
            }
            
            
            if (left.left == null || right.right == null) {
                if (left.left != right.right)
                    return (false);
            } else {
                q.offerLast(left.left);
                q.offerLast(right.right);
            }
        }
        
        return (true);
    }
}