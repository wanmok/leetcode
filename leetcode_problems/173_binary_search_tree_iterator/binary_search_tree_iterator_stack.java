/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {

    private Stack<TreeNode> stack = new Stack<>();
    
    public BSTIterator(TreeNode root) {
        push_tree(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return (! stack.empty());
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode curr = stack.pop();
        if (curr.right != null)
            push_tree(curr.right);
        return (curr.val);
    }
    
    private void push_tree(TreeNode root) {
        for (TreeNode curr = root; curr != null; curr = curr.left)
            stack.push(curr);
    }
}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */