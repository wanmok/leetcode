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
        travel(result, root, 1);
        
        return result;
    }
    
    private void travel(List<List<Integer>> result, TreeNode root, int level) {
        if (root == null) return ;
        
        if (result.size() < level) result.add(new LinkedList<>());
        
        // slightly modify the level order traversal
        // this is how to change the direction
        int reverse = level % 2;
        if (reverse == 1)
            result.get(level - 1).add(root.val);
        else
            result.get(level - 1).add(0, root.val);
        
        travel(result, root.left, level + 1);
        travel(result, root.right, level + 1);
    }
}