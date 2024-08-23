class Solution {
public:
    string reverseWords(string s) {
        string curr, result;
        int n = s.size();

        for (int i = n - 1; i >= -1; i--) {
            if (i >= 0 && s[i] != ' ') {
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
