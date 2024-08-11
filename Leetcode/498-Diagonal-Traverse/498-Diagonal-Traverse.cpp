class Solution {
public:
    vector<int> findDiagonalOrder(vector<vector<int>>& mat) {
        int i, j, m, n, ind, flag;
        i = 0; j = 0; ind = 0; m = mat.size(); n = mat[0].size(); flag = 1;
        vector<int> result(m * n);
        while (ind < n * m) {
            result[ind++] = mat[i][j];
            if (flag) {
                if (j == n - 1) {
                    flag = 0;
                    i++;
                } else if (i == 0) {
                    flag = 0;
                    j++;
                } else {
                    i--;
                    j++;
                }
            } else {
                if (i == m - 1) {
                    flag = 1;
                    j++;
                } else if (j == 0) {
                    flag = 1;
                    i++;
                } else {
                    i++;
                    j--;
                }
            }
        }
        return result;
    }
};
