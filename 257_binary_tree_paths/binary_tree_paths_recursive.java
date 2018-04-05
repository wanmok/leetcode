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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        
        if (root != null)
            paths(result, String.valueOf(root.val), root);
        
        return (result);
    }
    
    private void paths(List<String> lst, String temp, TreeNode root) {
        if (root.left == null && root.right == null) {
            lst.add(temp);
            return ;
        }
        
        if (root.left != null)
            paths(lst, temp + "->" + String.valueOf(root.left.val), root.left);
        if (root.right != null)
            paths(lst, temp + "->" + String.valueOf(root.right.val), root.right);
        
    }
}