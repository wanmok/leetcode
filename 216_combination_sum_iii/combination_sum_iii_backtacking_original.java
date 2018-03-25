class Solution {
	// TODO (WanMok) Spend more time on optimizing code

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 1; i <= 9; i ++) {
            List<Integer> previous = new ArrayList<Integer>();
            previous.add(i);
            solve(result, previous, k - 1, n - i, i);
        }
        return (result);
    }
    
    public void solve(List<List<Integer>> lst, List<Integer> previous, int k, int n, int last) {
        if (k == 1){
            if (last >= n)
                return;
            else if (n / 10 == 0){
                List<Integer> new_lst = new ArrayList<Integer>();
                new_lst.addAll(previous);
                new_lst.add(n);
                lst.add(new_lst);
                return;
            }
            else
                return;
        }
        
        for (int i = last + 1; i <= 9; i ++) {
            List<Integer> prev = new ArrayList<Integer>();
            prev.addAll(previous);
            prev.add(i);
            solve(lst, prev, k - 1, n - i, i);
        }
    }

}