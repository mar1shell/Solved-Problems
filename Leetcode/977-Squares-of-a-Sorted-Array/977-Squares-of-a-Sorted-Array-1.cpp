class Solution { // Solution 1
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int i, j, k, n;
        i = 0; n = nums.size(); k = j = n - 1;
        vector<int> result(n);

        while (i <= j) {
            if (abs(nums[i]) >= abs(nums[j])) {
                result[k] = nums[i] * nums[i];
                i++; k--;
            } else {
                result[k] = nums[j] * nums[j];
                j--; k--;
            }
        }
        return result;
    }
};
