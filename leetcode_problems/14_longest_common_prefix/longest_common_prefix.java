class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs[0].length() == 0) return "";
        
        StringBuilder sb = new StringBuilder();
        int count = 0;
        while (true) {
            char curr = 'a';
            if (count < strs[0].length())
                curr = strs[0].charAt(count);
            else return sb.toString();
            for (int i = 1; i < strs.length; i ++) {
                if (count < strs[i].length() 
                    && strs[i].charAt(count) == curr)
                    continue;
                
                return sb.toString();
            }
            sb.append(curr);
            count ++;
        }
    }
}