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
    // @NOTE StringBuilder.delete(i, j) [i, j).
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new LinkedList<>();
        solve(root, result, new StringBuilder());
        return result;
    }
    
    private void solve(TreeNode root, List<String> result, StringBuilder path) {
        if (root == null) return;
        
        int curr = path.length();
        path.append(root.val);
        if (root.left == null && root.right == null)
            result.add(path.toString());
        
        path.append("->");
        solve(root.left, result, path);
        solve(root.right, result, path);
        
        path.delete(curr, path.length());
    }
}