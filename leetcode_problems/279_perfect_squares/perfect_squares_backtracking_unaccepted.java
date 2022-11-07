class Solution {
    // this is the original thought
    // it will exceed time limit

    public int numSquares(int n) {
        return search(n);
    }
    
    private int search(int n) {    
        int near = (int)Math.sqrt(n);
        if (near == Math.sqrt(n)) return 1;
        
        int min = Integer.MAX_VALUE; 
        for (int i = 1; i <= near; i ++) {
            int current = 0;
            int remain = n - i * i;
            if (remain != 0)
                current = search(remain) + 1;
            if (current < min)
                min = current;
        }
        
        return (min);
    }
}