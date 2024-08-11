class Solution {
public:
    int dominantIndex(vector<int>& nums) {
        int max, i_max, _2nd_max, i, n;
        max = nums[0]; _2nd_max = nums[1]; i_max = 0; n = nums.size();
        for (i = 1; i < n; i++) {
            if (nums[i] > max) {
                _2nd_max = max;
                max = nums[i];
                i_max = i;
            } else if (nums[i] > _2nd_max) {
                _2nd_max = nums[i];
            }
        }
        return (max >= 2 * _2nd_max) ? i_max : -1; // we check if max is 2 times larger than _2nd_max
        // after we iterated over nums, max containes the largest and _2nd_max contains the second largest
    }
};