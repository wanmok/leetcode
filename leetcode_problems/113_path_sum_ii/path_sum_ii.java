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
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        solve(result, new ArrayList<>(), root, sum);
        return result;
    }
    
    private void solve(List<List<Integer>> result, List<Integer> path, TreeNode root, int sum) {
        if (root == null) return;
        
        path.add(root.val);
        int remain = sum - root.val;
        if (root.left == null && root.right == null) {
            if (remain == 0) {
                result.add(new ArrayList(path));
                path.remove(path.size() - 1);
                return ;
            }
        }
        
        if (root.left != null) 
            solve(result, path, root.left, remain);
        if (root.right != null) 
            solve(result, path, root.right, remain);
        
        path.remove(path.size() - 1);
    }
}