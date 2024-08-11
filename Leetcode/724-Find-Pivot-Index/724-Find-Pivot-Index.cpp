class Solution {
public:
    int vectorSum(vector<int>& nums) {
        int sum = 0;
        for(int i = 0; i < nums.size(); i++) {
            sum += nums[i];
        }
        return sum;
    }
    
    int pivotIndex(vector<int>& nums) {
        int left = 0, i = 0, right = vectorSum(nums) - nums[0], n = nums.size();
        while (left != right && i < n) {
            left += nums[i]; 
            if (i < n -1) {
                right -= nums[i + 1];
            }
            i++;   
        }
        return (i < n) ? i : -1;
    }
};