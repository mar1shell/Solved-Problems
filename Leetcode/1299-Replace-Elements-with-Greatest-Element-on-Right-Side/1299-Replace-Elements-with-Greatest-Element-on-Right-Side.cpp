class Solution {
public:
    vector<int> replaceElements(vector<int>& arr) {
        int i, n, temp, max;
        n = arr.size(); max = -1;

        for (i = n - 1; i >= 0; i--) {
            temp = arr[i];
            arr[i] = max;
            if (temp > max) {
                max = temp;
            } 
        }

        return arr;
    }
};
