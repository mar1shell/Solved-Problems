class Solution {
public:
    int lengthOfLastWord(string s) {
        string lastWord;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (lastWord == "" && s[i] == ' ') {
                continue;
            } else if (lastWord != "" && s[i] == ' ') {
                break;
            } else {
                lastWord += s[i];
            }
        }

        return lastWord.length();
    }
};