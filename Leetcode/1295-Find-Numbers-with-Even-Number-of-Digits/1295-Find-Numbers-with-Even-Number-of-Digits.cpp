class Solution {
public:
    int intLen(int n) { 
        // we will use the logarithmic way because 
        // it is way efficient without looping on the number
    if (n == 0) return 1; // Special case for zero
    return static_cast<int>(log10(n)) + 1;
    }
    
    int findNumbers(vector<int>& nums) {
        int i, n, result;
        result = 0; n = nums.size();
        
        for (i = 0; i < n; i++) {
            if (intLen(nums[i]) % 2 == 0) {
                result++;
            }
        }
        
        return result;
    }
};
