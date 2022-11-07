class Solution {
    public String getHint(String secret, String guess) {
        int bull = 0, cow = 0;
        int[] seen = new int[10]; // array is enough...
        
        for (int i = 0; i < secret.length(); i ++) {
            if (secret.charAt(i) == guess.charAt(i)) bull ++;
            else {
                // seen the number
                if (seen[secret.charAt(i) - '0']-- > 0) cow ++;
                if (seen[guess.charAt(i) - '0']++ < 0) cow ++;
            }
        }
        
        return String.format("%dA%dB", bull, cow);
    }
}