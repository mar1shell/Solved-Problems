class Solution {
public:
    vector<int> sortArrayByParity(vector<int>& nums) {
        int i = 0, n = nums.size(), j = n - 1, temp;

        while (i < j) {
            if (nums[i] % 2 == 0) {
                i++;
            } else if (nums[j] % 2 == 1) {
                j--;
            } else {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
        }

        return nums;
    }
};
