class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int, int> nums_table;
        vector<int> result;
        for (int i = 0; i < nums.size(); i ++){
            int complement = target - nums[i];
            if (nums_table.find(complement) != nums_table.end() && nums_table[complement] < i){
                result.push_back(nums_table[complement]);
                result.push_back(i);
                return(result);
            }
            nums_table[nums[i]] = i;
        }
    }
};