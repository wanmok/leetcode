class Solution {
    // recursive approach is not necessary
    // so... think about a more elegant way...
    // what about iterative?
    // see....
    // maybe I should pay more attention to the outside constraints...
    // that makes the code more clean...
    // case 1:
    // [0] where there is no changing point and left == right == mid
    // case 2:
    // [5, 1, 2, 3] where the changing point is between 0 ~ (nums.length - 1)
    // having nums[point] < nums[point - 1]
    // case 3:
    // [0, 1, 2, -1] where the changing point is at the end of the array
    // having nums[point] < nums[point - 1]
    
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        int mid;
        
        while (left < right) {
            if (nums[left] < nums[right]) // ?? I think my original solution is idiot...
                return (nums[left]);
            
            mid = (left + right) / 2;
            if (nums[mid] >= nums[left])
                left = mid + 1; 
            else 
                right = mid;
        }
        
        return (nums[left]);
    }

}