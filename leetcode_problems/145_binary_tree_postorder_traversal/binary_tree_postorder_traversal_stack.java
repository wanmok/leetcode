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
        Deque<TreeNode> stack = new LinkedList<>();
        
        if (root == null)
            return (result);
        
        stack.offerLast(root);
        
        while (! stack.isEmpty()) {
            TreeNode t = stack.peekLast();
            
            if (t.left != null || t.right != null) {
                if (t.right != null) {
                    stack.offerLast(t.right);
                    t.right = null;
                }
                if (t.left != null){
                    stack.offerLast(t.left);
                    t.left = null;
                }
            } else {
                result.add(t.val);
                stack.removeLast();
            }
            
        }
        
        return (result);
        
    }
}