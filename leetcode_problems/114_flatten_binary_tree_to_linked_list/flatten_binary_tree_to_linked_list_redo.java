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
    // @COMPANY Facebook
    // @KEYWORD Tree, Depth-first Search
    // @NOTE Build the linked list from the right side.
    
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