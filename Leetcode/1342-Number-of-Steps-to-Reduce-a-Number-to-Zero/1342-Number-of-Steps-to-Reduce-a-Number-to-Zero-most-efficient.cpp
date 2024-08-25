class Solution {
public:
    int numberOfSteps(int num) {
        int count;
        if (!num) {
            return 0;
        } else {
            int bitLength = static_cast<int>(floor(log2(num))) + 1;
            int bitCount = __builtin_popcount(num);
            return bitLength - 1 + bitCount;
        }
    }
};
