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
    public int maxDepth(TreeNode root) {
        return (count_depth(root));
    }
    
    public int count_depth(TreeNode root) {
        if (root == null)
            return (0);
        
        int left_count = 0;
        int right_count = 0;
        if (root.left != null)
            left_count = count_depth(root.left);
        if (root.right != null)
            right_count = count_depth(root.right);
        
        return ((left_count > right_count ? left_count : right_count) + 1);
    }
}