class Solution {
public:
    int majorityElement(vector<int>& nums) {
        unordered_map<int, int> nums_table;
        vector<int>::iterator iterator;
        for (iterator = nums.begin(); iterator < nums.end(); iterator ++) {
            if (nums_table.find(*iterator) != nums_table.end()){
                nums_table[*iterator] = nums_table[*iterator] + 1;
            } else
                nums_table.insert({*iterator, 1});
        }
        
        int max(0), number(0);
        for (auto& x: nums_table){
            if (x.second > max){
                max = x.second;
                number = x.first;
            }
                
        }
        
        if (max > (nums.size() / 2))
            return(number);
        else
            return(-1);
    }
};