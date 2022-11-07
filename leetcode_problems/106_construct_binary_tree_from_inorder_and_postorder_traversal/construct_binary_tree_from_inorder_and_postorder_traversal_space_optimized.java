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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder.length == 0 || inorder.length == 0) return null;
        
        TreeNode root = tree(postorder, 0, inorder, 0, inorder.length - 1);
        return root;
    }
    
    private TreeNode tree(int[] postorder, int start, int[] inorder, int left, int right) {
        if (left > right) return null;
        if (left == right) return new TreeNode(inorder[left]);
        
        int root = postorder[postorder.length - 1 - start];
        TreeNode t = new TreeNode(root);
        int i = left;
        while (i <= right && root != inorder[i])
            i ++;
        
        t.left = tree(postorder, start + (right - i) + 1, inorder, left, i - 1);
        t.right = tree(postorder, start + 1, inorder, i + 1, right);
        
        return t;
    }
}