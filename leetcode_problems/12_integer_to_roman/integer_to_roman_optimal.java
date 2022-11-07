class Solution {
    public String intToRoman(int num) {
        String[][] roman_sets = new String[][]{
            {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
            {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
            {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
            {"", "M", "MM", "MMM"}
        };
        
        String result = roman_sets[3][num / 1000 % 10];
        result = result + roman_sets[2][num / 100 % 10];
        result = result + roman_sets[1][num / 10 % 10];
        result = result + roman_sets[0][num % 10];
        
        return (result);
    }
}