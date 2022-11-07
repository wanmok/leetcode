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
    // @COMPANY Facebook
    // @KEYWORD Tree, Depth-first Search
    // @NOTE in-order traversal!
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode curr, prev = null;
        
        curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.offerLast(curr);
                curr = curr.left;
            }
            curr = stack.pollLast();
            if (prev != null && prev.val >= curr.val) return false;
            prev = curr;
            curr = curr.right;
        }
        
        return true;
    }
}