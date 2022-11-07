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
        Deque<TreeNode> q = new LinkedList<>();
        int level = 1;
        if (root != null)
            q.offerLast(root);
        
        while (! q.isEmpty()) {            
            if (result.size() < level)
                result.add(new ArrayList<>());
            
            int count = q.size();
            for (int i = 0; i < count; i ++) {
                TreeNode t = q.pollFirst();
                result.get(level - 1).add(t.val);
                if (t.left != null)
                    q.offerLast(t.left);
                if (t.right != null)
                    q.offerLast(t.right);
            }
            
            level ++;
        }
        
        return (result);
    }
}