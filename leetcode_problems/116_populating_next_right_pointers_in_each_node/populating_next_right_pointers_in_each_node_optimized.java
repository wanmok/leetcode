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
        Deque<TreeLinkNode> q = new LinkedList<>();
        q.offerLast(root);
        while (!q.isEmpty()) {
            int count = q.size();
            TreeLinkNode current = q.pollFirst();
            TreeLinkNode next = null;
            
            if (current == null) break;
            
            for (int i = 0; i < count - 1; i ++) {
                next = q.pollFirst();
                
                current.next = next; // figure out what would be the next
                
                q.offerLast(current.left);
                q.offerLast(current.right);
                
                current = next;
            }
            current.next = null;
            q.offerLast(current.left);
            q.offerLast(current.right);
        }
        
    }
}