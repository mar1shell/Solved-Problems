class Solution:
    def hasSameDigits(self, s: str) -> bool:
        while len(s) > 2:
            currentDigits = []
            for index in range(1, len(s)):
                currentDigits.append(str((int(s[index]) + int(s[index - 1])) % 10)) 

            s = ''.join(currentDigits)

        return  s[0] == s[1]