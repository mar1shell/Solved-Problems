class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sChars = Counter(s)
        tChars = Counter(t)
        charsCount = sChars if sChars.keys() >= tChars.keys() else tChars
        for char in charsCount:
            if char not in tChars or sChars[char] != tChars[char]:
                return False

        return True