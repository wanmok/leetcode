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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (postorder.length == 0 || inorder.length == 0) return null;
        
        Deque<Integer> p = new LinkedList<>();
        for (Integer num : postorder)
            p.offerLast(num);
        TreeNode root = tree(p, inorder, 0, inorder.length - 1);
        return root;
    }
    
    private TreeNode tree(Deque<Integer> p, int[] inorder, int left, int right) {
        if (left > right) return null;
        if (left == right) {
            TreeNode t = new TreeNode(inorder[left]);
            p.removeLast();
            return t;
        }
        
        Integer root = p.pollLast();
        TreeNode t = new TreeNode(root);
        int i = left;
        while (i <= right && !root.equals(inorder[i]))
            i ++;
        
        t.right = tree(p, inorder, i + 1, right);
        t.left = tree(p, inorder, left, i - 1);
        
        return t;
    }
}