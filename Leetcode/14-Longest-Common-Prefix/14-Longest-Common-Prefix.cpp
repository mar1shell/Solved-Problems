class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        int n = strs[0].size(), m = strs.size();
        string result = "";

        for(int i = 0; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (strs[j][i] == '\0' || strs[j][i] != strs[0][i]) {
                    return result;
                }
            }

            result += strs[0][i];
        }

        return result;
    }
};
