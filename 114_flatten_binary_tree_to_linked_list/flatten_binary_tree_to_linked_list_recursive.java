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
    public void flatten(TreeNode root) {
        // never overthink of the problem
        // if it is not simple, it is wrong
        
        if (root == null) return ;
        
        TreeNode curr = root.left;
        flatten(root.left);
        flatten(root.right);
        
        // this criterion is important
        if (curr == null) return ;
        while (curr.right != null)
            curr = curr.right;
        curr.right = root.right;
        
        root.right = root.left;
        root.left = null;
        
    }
}