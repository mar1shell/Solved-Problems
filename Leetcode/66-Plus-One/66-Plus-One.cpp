class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        int flag, i;
        flag = 1; i = digits.size() - 1;
        while (flag && i >= 0) {
            digits[i]++;
            if (digits[i] == 10) {
                digits[i] = 0;
                i--;
            } else {
                flag = 0;
            }
        }
        
        if (i == -1) {
            digits.insert(digits.begin(), 1);
        }
        
        return digits;
    }
};
