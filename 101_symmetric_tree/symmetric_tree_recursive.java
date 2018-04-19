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
        if (root == null)
            return (true);
        
        return (sym(root.left, root.right));
    }
    
    private boolean sym(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return (left == right);
        } else {
            if (left.val == right.val) {
                if (sym(left.left, right.right) && sym(left.right, right.left))
                    return (true);
                else
                    return (false);
            } else
                return (false);
        }
    }
}