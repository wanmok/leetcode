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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        solve(result, 1, root);
        
        return (result);
    }
    
    private void solve(List<List<Integer>> lst, int level, TreeNode root) {
        if (root == null)
            return ;
        
        if (lst.size() < level)
            lst.add(new ArrayList<>());
        
        lst.get(level - 1).add(root.val);
        solve(lst, level + 1, root.left);
        solve(lst, level + 1, root.right);
    }
}