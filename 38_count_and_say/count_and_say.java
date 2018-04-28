class Solution {
    public String countAndSay(int n) {
        String s = "1";
        
        for (int i = 1; i < n; i ++) {
            char prev = s.charAt(0);
            int count = 0;
            StringBuilder new_s = new StringBuilder();
            for (int j = 0; j < s.length(); j ++) {
                if (prev == s.charAt(j)) 
                    count ++;
                else {
                    new_s.append(count);
                    new_s.append(prev);
                    
                    prev = s.charAt(j);
                    count = 1;
                }
            }
            new_s.append(count);
            new_s.append(prev);
            
            s = new_s.toString();
        }
        
        return s;
        
    }
}