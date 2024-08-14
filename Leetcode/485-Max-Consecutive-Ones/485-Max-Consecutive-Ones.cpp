class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int i, n, curr_streak, max;
        n = nums.size(); max = 0; curr_streak = 0;
        
        for (i = 0; i < n; i++) {
            if (nums[i] == 1) {
                curr_streak++;
            } else {
                max = (curr_streak > max) ? curr_streak : max;
                curr_streak = 0;
            }
        }
        max = (curr_streak > max) ? curr_streak : max; // to handle case where there's 1 at the end
        return max;
    }
};
