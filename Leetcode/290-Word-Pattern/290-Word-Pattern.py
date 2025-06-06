class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        words = s.split()
        charToWord = {}
        wordToChar = {}

        if len(words) != len(pattern):
            return False

        for index, char in enumerate(pattern):
            if char in charToWord and charToWord[char] != words[index]:
                return False
            elif words[index] in wordToChar and wordToChar[words[index]] != char:
                return False
            else:
                if char not in charToWord:
                    charToWord[char] = words[index]
                if words[index] not in wordToChar:
                    wordToChar[words[index]] = char

        return True