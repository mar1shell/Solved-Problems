class Solution {
public:
    void duplicateZeros(vector<int>& arr) {
        int i, n;
        n = arr.size();
        
        for (i = 0; i < n - 1; i++) {
            if (arr[i] == 0) {
                arr.insert(arr.begin() + i, 0);
                arr.pop_back();
                i++;
            }
        }
    }
};
