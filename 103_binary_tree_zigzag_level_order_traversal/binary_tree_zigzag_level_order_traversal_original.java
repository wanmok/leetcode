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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return (new ArrayList<>());
        
        List<List<Integer>> result = new ArrayList<>();
        List<TreeNode> q = new LinkedList<>();
        
        boolean reverse = false;
        q.add(root);
        while (!q.isEmpty()) {
            List<Integer> layer = new ArrayList<>();
            int num = q.size();
            for (int i = 0; i < num; i ++) {
                int idx;
                if (reverse)
                    idx = num - 1 - i;
                else
                    idx = i;
                layer.add(q.get(idx).val);
                TreeNode current = q.get(i);
                if (current.left != null) q.add(current.left);
                if (current.right != null) q.add(current.right);
            }
            for (int i = 0; i < num; i ++)
                q.remove(0);
            
            result.add(layer);
            reverse = !reverse;
        }
        
        return result;
    }
}