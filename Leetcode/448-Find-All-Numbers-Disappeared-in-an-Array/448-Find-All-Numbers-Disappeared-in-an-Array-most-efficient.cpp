class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
        int j, n = nums.size();
        vector<int> result;

        for (int i = 0; i < n; i++) {
            j = abs(nums[i]) - 1;
            nums[j] = -abs(nums[j]);
        }
        
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                result.push_back(i + 1);
            }
        }

        return result;
    }
};
