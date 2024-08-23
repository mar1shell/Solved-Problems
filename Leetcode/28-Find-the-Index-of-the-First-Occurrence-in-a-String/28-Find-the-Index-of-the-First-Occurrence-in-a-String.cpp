class Solution {
public:
    int strStr(string haystack, string needle) {
        int n = haystack.size(), m = needle.size();
        
        for (int i = 0; i < n; i++) {
            int flag = 0;

            for (int j = 0; j < m & i + j < n; j++) {
                if (haystack[i + j] == needle[j]) {
                    flag++;
                }
            }

            if (flag == m) {
                return i;
            }
        }

        return -1;
    }
};
