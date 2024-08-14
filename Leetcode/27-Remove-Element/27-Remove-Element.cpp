class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int i, j, temp;
        i = 0; j = nums.size() - 1; 
        while (i <= j) {
            if (nums[i] == val) {
                if (nums[j] != val) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j--;
            } else {
                i++;
            }
        }
        
        return i;
    }
};
