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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        Deque<TreeNode> q = new LinkedList<>();
        int level = 1;
        
        if (root == null)
            return (result);
        
        q.offerLast(root);
        while (! q.isEmpty()) {
            if (result.size() < level)
                result.add(0, new ArrayList<>());
            
            int count = q.size();
            for (int i = 0; i < count; i ++) {
                TreeNode t = q.pollFirst();
                
                result.get(0).add(t.val);
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