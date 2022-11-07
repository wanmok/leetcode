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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        solve(result, root);
        return (result);
    }
    
    private void solve(List<Integer> lst, TreeNode root) {
        if (root == null)
            return ;
        
        solve(lst, root.left);
        solve(lst, root.right);
        lst.add(root.val);
    }
}