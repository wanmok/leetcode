class Solution {
    public int lengthOfLastWord(String s) {
        String[] ss = s.split(" ");
        
        return ss.length < 1 ? 0 : ss[ss.length - 1].length();
    }
}