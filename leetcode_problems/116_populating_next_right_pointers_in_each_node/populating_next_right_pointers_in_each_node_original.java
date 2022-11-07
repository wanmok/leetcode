/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if (root == null) return ;
        
        Deque<TreeLinkNode> q = new LinkedList<>();
        q.offerLast(root);
        while (!q.isEmpty()) {
            int count = q.size();
            TreeLinkNode current = q.pollFirst();
            TreeLinkNode next = null;
            for (int i = 0; i < count; i ++) {
                if (i == count - 1)
                    next = null;
                else
                    next = q.pollFirst();
                
                current.next = next; // figure out what would be the next
                
                if (current.left != null) q.offerLast(current.left);
                if (current.right != null) q.offerLast(current.right);
                
                current = next;
            }
        }
        
    }
}