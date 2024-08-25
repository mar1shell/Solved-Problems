class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        memo = {}
        for c in ransomNote:
            if c in memo:
                memo[c] += 1
            else:
                memo[c] = 1
        
        for c in magazine:
            if c in memo:
                memo[c] -= 1
                if memo[c] == 0:
                    _ = memo.pop(c)
                if memo == {}:
                    return True
        
        return False
