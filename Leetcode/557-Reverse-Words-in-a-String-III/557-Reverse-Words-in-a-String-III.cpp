class Solution {
public:
    string reverseWords(string s) {
        string curr, result;
        int n = s.size();

        for (int i = 0; i <= n; i++) {
            if (i < n && s[i] != ' ') {
                curr += s[i];
            } else if (!curr.empty()) {
                reverse(curr.begin(), curr.end());
                
                if (!result.empty()) {
                    result += ' ';
                }
                
                result += curr;
                curr = "";
            }
        }

        return result;
    }
};
