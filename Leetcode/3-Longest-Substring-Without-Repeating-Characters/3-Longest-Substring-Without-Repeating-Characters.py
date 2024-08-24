class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        memo = set([])
        i = 0
        j = 0
        res = 0
        curr = 0
        lenS = len(s)
        while j < lenS:
            if s[j] not in memo:
                memo.add(s[j])
                curr += 1
                j += 1
                res = max(res, curr)
            else:
                memo.remove(s[i])
                i += 1
                curr -= 1
        return res
