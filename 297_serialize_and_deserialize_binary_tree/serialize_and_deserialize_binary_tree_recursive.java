/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {
    // don't overestimate the problem
    // always bear in mind that the solution will be simple and concise
    
    private static final String NULL = "null";
    private static final String SPLITER = ",";
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        build_string(root, sb);
        return String.format("[%s]", sb.substring(0, sb.length() - 1).toString());
    }
    
    private void build_string(TreeNode root, StringBuilder sb) {
        if (root == null) {
            sb.append(NULL).append(SPLITER);
            return ;
        }
        
        sb.append(root.val).append(SPLITER);
        build_string(root.left, sb);
        build_string(root.right, sb);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.substring(1, data.length() - 1).split(SPLITER)));
        
        return build_tree(nodes);
    }
    
    private TreeNode build_tree(Deque<String> nodes) {
        String node = nodes.pollFirst();
        if (node.equals(NULL)) return null;
        TreeNode n = new TreeNode(Integer.valueOf(node));
        n.left = build_tree(nodes);
        n.right = build_tree(nodes);
        
        return n;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));