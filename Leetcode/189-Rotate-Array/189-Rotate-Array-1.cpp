class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        int n = nums.size(), j;
        vector<int> result(n);

        for (int i = 0; i < n; i++) {
            j = (i + k) % n;
            result[j] = nums[i]; 
        }

        nums = move(result);
    }
};
