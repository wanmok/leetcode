class Solution {
public:
    int majorityElement(vector<int>& nums) {
        return majority(nums, 0, nums.size() - 1);
    }
    
    int count_range(vector<int>& nums, int num, int left, int right) {
        int count(0);
        for (int i = left; i <= right; i ++){
            if (nums[i] == num)
                count++;
        }
        return(count);
    }
    
    int majority(vector<int>& nums, int left, int right) {
        if (left == right)
            return(nums[left]);
        
        int mid = (right - left) / 2 + left;
        int left_num = majority(nums, left, mid);
        int right_num = majority(nums, mid + 1, right);
        
        if (left_num == right_num)
            return(left_num);
        else {
            int left_count = count_range(nums, left_num, left, right);
            int right_count = count_range(nums, right_num, left, right);
            
            return left_count > right_count ? left_num : right_num;
        }
    }
};