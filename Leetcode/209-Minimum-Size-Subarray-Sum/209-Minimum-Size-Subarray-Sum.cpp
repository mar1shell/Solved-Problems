class Solution {
public:
    int minSubArrayLen(int target, vector<int>& nums) {
        int i = 0, j = 0, sum = 0, n = nums.size(), minLength = n + 1;
        while (j <= n) {
            if (j < n && sum < target) {
                sum += nums[j];
                j++;
            } else if (i < n && sum >= target) {
                minLength = min(minLength, j - i);
                sum -= nums[i];
                i++;
            } else {
                j++;
            }
        }

        return (minLength <= n) ? minLength : 0;
    }
};
