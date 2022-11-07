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
    // a balanced BST is built like doing binary searching
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        TreeNode root = insert(nums, 0, nums.length - 1);
        return root;
    }
    
    private TreeNode insert(int[] nums, int left, int right) {
        if (left > right) return null;
        
        int mid = (left + right) / 2;
        TreeNode curr = new TreeNode(nums[mid]);
        curr.left = insert(nums, left, mid - 1);
        curr.right = insert(nums, mid + 1, right);
        
        return curr;
    }
}


