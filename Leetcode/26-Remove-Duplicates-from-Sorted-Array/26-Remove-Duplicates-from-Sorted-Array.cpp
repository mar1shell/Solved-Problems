class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int i, j, n;
        i = 0; j = 1; n = nums.size();
        
        if (n == 0) {
            return 0;
        }
        
        while (j < n) {
            if (nums[i] != nums[j]) {
                nums[++i] = nums[j];
            }
            
            j++;
        }
        
        return i + 1;
    }
};
