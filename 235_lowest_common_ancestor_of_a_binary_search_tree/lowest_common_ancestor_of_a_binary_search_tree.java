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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val <= root.val && root.val <= q.val)
            return (root);
        else if (p.val >= root.val && root.val >= q.val)
            return (root);
        else if (p.val <= root.val && q.val <= root.val) {
            if (root.left == null)
                return (root);
            return (lowestCommonAncestor(root.left, p, q));
        } else {
            if (root.right == null)
                return (root);
            return (lowestCommonAncestor(root.right, p, q));
        }
    }
}