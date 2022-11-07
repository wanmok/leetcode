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
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode>[] result = new List[n + 1];
        result[0] = new ArrayList<>();
        if (n == 0) return result[0];
        
        result[0].add(null);
        for (int i = 1; i <= n; i ++) {
            result[i] = new ArrayList<>();
            
            for (int j = 0; j < i; j ++) {
                for (TreeNode left : result[j]) {
                    for (TreeNode right : result[i - j -1]) {
                        TreeNode root = new TreeNode(j + 1);
                        root.left = left;
                        root.right = cloneTree(right, j + 1);
                        result[i].add(root);
                    }
                }
            }
        }
        
        return result[n];
    }
    
    private TreeNode cloneTree(TreeNode root, int offset) {
        if (root == null) return null;
        
        TreeNode t = new TreeNode(root.val + offset);
        t.left = cloneTree(root.left, offset);
        t.right = cloneTree(root.right, offset);
        
        return t;
    }
}