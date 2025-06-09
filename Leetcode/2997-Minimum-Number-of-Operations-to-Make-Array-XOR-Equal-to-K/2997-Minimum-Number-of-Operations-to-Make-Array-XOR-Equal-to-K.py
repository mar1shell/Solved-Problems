class Solution:
    def minOperations(self, nums: List[int], k: int) -> int:
        numsXORproduct = 0

        for num in nums:
            numsXORproduct = numsXORproduct ^ num

        if numsXORproduct == k:
            return 0

        result = bin(k ^ numsXORproduct)
        count = 0
        index = -1

        while result[index] != 'b':
            if result[index] == '1':
                count += 1
            index -= 1

        return count