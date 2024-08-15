class Solution { // Solution 2
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int i, j, k, n;
        i = k = 0; n = nums.size();
        vector<int> result(n);

        while (i < n && nums[i] < 0) {
            i++;
        }

        j = i - 1;

        while (i < n && j >= 0) {
            if (nums[i] <= (-nums[j])) {
                result[k] = nums[i] * nums[i];
                k++; i++;
            } else {
                result[k] = nums[j] * nums[j];
                k++; j--;
            }
        }

        while (i < n) {
            result[k] = nums[i] * nums[i];
            k++; i++;
        }

        while (j >= 0) {
            result[k] = nums[j] * nums[j];
            k++; j--;
        }

        return result;
    }
};
