class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int i, j, n;
        i = -1; n = nums.size();
        
        for (j = 0; j < n; j++) {
            if(nums[j] != 0) {
                i++;
                nums[i] = nums[j];
            }
        }

        i++;
        
        while (i < n && i >= 0) {
            nums[i++] = 0;
        }
    }
};
