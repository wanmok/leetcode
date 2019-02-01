          1
        /   \
      2      3
     / \
    4   5
            
Ancestor(4): 4, 2, 1
            
Input: n1, n2 (4, 5)
Output: LCA (2)
  
  
TreeNode left right val

class Solution {
  public TreeNode lca(TreeNode root, TreeNode n1, TreeNode n2) {
    if (root == null || root == n1 || root == n2)
      return root;
    
    TreeNode left = lca(root.left, n1, n2);
    TreeNode right = lca(root.right, n1, n2);
    
    return left == null ? right : right == null ? left : root;
  }
}

Time complexity: O(N)
Space complexity: O(logN)
  
  
  
Ordering: [c, b, a]
WordList = [cc, cb, ba]
Output: True

WordList = [cb, ca, cc]
Output: False

cc ccc
WordList = [ccc, cc] False
WordList = [cc, ccc] True

char[] Ordering

boolean isOrdered(char[] ordering, String[] wordList) {
  Map<char, Integer> ord = new HashMap<>();
  
  for (int i = 0; i < ordering.length; i ++) {
    ord.put(ordering[0], ordering.lengh - i);
  }
  
  for (int i = 0; i < wordList.length; i ++) {  // word level
    for (int j = i+1; j < wordList.length; j ++) {
      int o1 = 0;
      int o2 = 0;
      while (o1 < wordList[i].length() && o2 < wordList[j].length()) {  // character
        if (ord.get(wordList[i].charAt(o1)) < ord.get(wordList[j].charAt(o2)))
          return false;
      }
      if (wordList[i].length() > wordList[j].length) return false;
    }
  }
  
  return true;
}

Time Complexity: 