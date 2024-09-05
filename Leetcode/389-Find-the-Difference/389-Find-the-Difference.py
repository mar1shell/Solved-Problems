class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        seen = Counter(s)

        for c in t:
            if (c not in seen) or (seen[c] == 0):
                return c
            else:
                seen[c] -= 1
