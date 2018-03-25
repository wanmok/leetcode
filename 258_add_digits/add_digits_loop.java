class Solution {
    public int addDigits(int num) {
        int remain = 0;
        int sum = 0;
        
        while (! (sum / 10 == 0 && num == 0)){
            if (num == 0){
                num = sum;
                sum = 0;
            }
            
            remain = num % 10;
            num /= 10;
            sum += remain;
        }
        
        return (sum);
    }
}