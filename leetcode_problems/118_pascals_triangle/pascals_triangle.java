class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < numRows; i ++) {
            List<Integer> row = new ArrayList<>();
            
            row.add(1);
            for (int j = 1; j <= i; j ++) {
                int temp;
                if (j > i - 1)
                    temp = 1;
                else 
                    temp = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                row.add(temp);
            }
            
            result.add(row);
        }
        
        return (result);
    }
}