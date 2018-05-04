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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 || inorder.length == 0) return null;
        
        Deque<Integer> p = new LinkedList<>();
        for (Integer num : preorder)
            p.offerLast(num);
        TreeNode root = tree(p, inorder, 0, inorder.length - 1);
        return root;
    }
    
    private TreeNode tree(Deque<Integer> p, int[] inorder, int left, int right) {
        if (left > right) return null;
        if (left == right) {
            TreeNode t = new TreeNode(inorder[left]);
            p.removeFirst();
            return t;
        }
        
        Integer root = p.pollFirst();
        TreeNode t = new TreeNode(root);
        int i = left;
        while (i <= right && !root.equals(inorder[i]))
            i ++;
        
        t.left = tree(p, inorder, left, i - 1);
        t.right = tree(p, inorder, i + 1, right);
        
        return t;
    }
}