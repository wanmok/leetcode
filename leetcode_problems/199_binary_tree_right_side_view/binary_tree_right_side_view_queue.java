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

    // Actually, I think this solution is better than the one in the solution page....
    // https://leetcode.com/problems/binary-tree-right-side-view/solution/

    public List<Integer> rightSideView(TreeNode root) {
        Deque<TreeNode> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        
        if (root == null)
            return (result);
        
        q.offerLast(root);
        while (! q.isEmpty()) {
            int count = q.size();
            
            for (int i = 0; i < count; i ++) {
                TreeNode curr = q.pollFirst();
                if (i == count - 1)
                    result.add(curr.val);
                if (curr.left != null)
                    q.offerLast(curr.left);
                if (curr.right != null)
                    q.offerLast(curr.right);
            }
        }
        
        return (result);
    }
}