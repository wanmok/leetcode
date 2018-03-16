class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> result;
        
        for (int it_outer = 0; it_outer < nums.size(); it_outer++){
            for (int it_inner = it_outer + 1; it_inner < nums.size(); it_inner++){
                if (nums[it_outer] == target - nums[it_inner]){
                    result.push_back(it_outer);
                    result.push_back(it_inner);
                    return(result);
                }
            }
        }
    }
};