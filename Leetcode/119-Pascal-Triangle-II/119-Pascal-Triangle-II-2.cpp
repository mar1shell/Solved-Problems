class Solution { //used the symetrie of C(p, n) to minimise half the calculations
public:
    long binomial_coeff(int n, int p) {
        long result = 1;
        if (p > n - p) {
            p = n - p;
        } 

        for (int i = 0; i < p; i++) {
            result *= (n - i);
            result /= (i + 1);
        }

        return result;
    }

    vector<int> getRow(int rowIndex) {
        int n = rowIndex + 1; 
        vector<int> result(n);

        for (int i = 0; i <= rowIndex / 2; i++) {
            result[i] = binomial_coeff(n - 1, i);
            result[rowIndex - i] = result[i];
        }

        return result;
    }
};
