class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        int n = nums.size(), j = 0, k = n - 1;
        vector<int> result(n);
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                result[j++] = nums[i];
            } else {
                result[k--] = nums[i];
            }
        }

        return result;
    }
};
