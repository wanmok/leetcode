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
        TreeLinkNode prev = root, curr = root;
        
        while (prev.left != null || prev.right != null || prev.next != null) {
            if (curr.left != null && curr.right != null) {
                curr.left.next = curr.right;
                curr.right.next = nextSibling(curr);
            } else if (curr.left != null) 
                curr.left.next = nextSibling(curr);
            else if (curr.right != null) 
                curr.right.next = nextSibling(curr);
            
            if (curr.next != null) {
                curr = curr.next;
            } else {
                curr = prev;
                while (curr != null && curr.left == null && curr.right == null) 
                    curr = curr.next;
                
                if (curr == null) return ;
                if (curr.left != null) prev = curr.left;
                else if (curr.right != null) prev = curr.right;
                curr = prev;
            }
        }
    }
    
    private TreeLinkNode nextSibling(TreeLinkNode curr) {
        curr = curr.next;
        while (curr != null) {
            if (curr.left != null) return curr.left;
            if (curr.right != null) return curr.right;
            curr = curr.next;
        }
        return null;
    }
}