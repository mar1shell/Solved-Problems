class Solution {
    int wealthSum(vector<vector<int>>& accounts, int i, int m) {
        int sum = 0;

        for (int j = 0; j < m; j++) {
            sum += accounts[i][j];
        }

        return sum;
    }
public:
    int maximumWealth(vector<vector<int>>& accounts) {
        int curr, maxWealth = 0, n = accounts.size(), m = accounts[0].size();

        for (int i = 0; i < n; i++) {
            curr = wealthSum(accounts, i, m);
            maxWealth = max(maxWealth, curr); 
        }

        return maxWealth;
    }
};
