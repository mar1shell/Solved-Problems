class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> result(rowIndex + 1, 1);
        long long temp;

        for (int i = 1; i <= rowIndex / 2; i++) {
            temp = static_cast<long long>(result[i - 1]) * (rowIndex - i + 1);
            temp /= i;
            result[rowIndex - i] = result[i] = temp;
        }

        return result;
    }
};
