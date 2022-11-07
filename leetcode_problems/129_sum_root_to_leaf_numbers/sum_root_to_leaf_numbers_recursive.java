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
    public int sumNumbers(TreeNode root) {
        return (sum_up(root, 0));
    }
    
    private int sum_up(TreeNode root, int prev) {
        if (root == null) return (0);
        
        int left, right;
        left = sum_up(root.left, prev * 10 + root.val);
        right = sum_up(root.right, prev * 10 + root.val);
        
        return (left + right == 0 ? prev * 10 + root.val : left + right);
    }
}