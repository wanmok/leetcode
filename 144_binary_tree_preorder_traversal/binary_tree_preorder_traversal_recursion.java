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
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null)
            return (new ArrayList<Integer>());
        
        List<Integer> result = new ArrayList<Integer>();
        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        
        return (result);
    }
}