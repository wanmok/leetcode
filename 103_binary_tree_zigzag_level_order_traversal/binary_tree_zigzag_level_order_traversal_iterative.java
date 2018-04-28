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
        if (root == null) return (new LinkedList<>());
        
        List<List<Integer>> result = new LinkedList<>();
        Deque<TreeNode> q = new LinkedList<>();
        
        int level = 1;
        
        q.offerLast(root);
        while (!q.isEmpty()) {
            if (result.size() < level) result.add(new LinkedList<>());
            
            int count = q.size();
            for (int i = 0; i < count; i ++) {
                TreeNode current = q.pollFirst();
                
                if (level % 2 == 1)
                    result.get(level - 1).add(current.val);
                else
                    result.get(level - 1).add(0, current.val);
                
                if (current.left != null) q.offerLast(current.left);
                if (current.right != null) q.offerLast(current.right);
            }
            level ++;
        }
        
        return result;
    }
}