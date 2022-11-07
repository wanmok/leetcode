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
    private TreeNode last = null;
    
    public void flatten(TreeNode root) {
        if (root == null) return ;
        
        flatten(root.right);
        flatten(root.left);
        
        root.right = last;
        root.left = null;
        
        last = root;
    }
}