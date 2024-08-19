class Solution { // reduce half of calculatins by taking advanteg of C(n,p) Symetrie
public:
    int binomial_coeff(int n, int p) {
        int i, j, result;
        result = 1;
        if (p > n - p) {
            p = n - p;
        }
        
        for (i = 0; i < p; i++) {
            result *= (n - i);
            result /= (i + 1);
        }
        
        return result;
    }
    
    vector<vector<int>> generate(int numRows) {
        int i, j;
        vector<vector<int>> result(numRows);
        for (i = 0; i < numRows; i++) {
            result[i].resize(i + 1);
            for (j = 0; j <= i / 2; j++) {
                result[i][j] = binomial_coeff(i, j);
                result[i][i - j] = result[i][j];
            }
        }
        return result;
    }
};
