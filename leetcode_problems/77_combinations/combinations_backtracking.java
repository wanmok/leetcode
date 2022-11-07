class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        solve(result, null, n, k);
        return (result);
    }
    
    private void solve(List<List<Integer>> lst, List<Integer> temp, int n, int k) {
        if (k == 0) {
            lst.add(new ArrayList<>(temp));
            return ;
        }
        
        for (int i = n; i >= 1; i --) {
            if (temp == null)
                temp = new ArrayList<>();
            
            temp.add(i);
            solve(lst, temp, i - 1, k - 1);
            temp.remove(temp.size() - 1);
        }
    }
}