# Intuition
The problem requires finding the length of the longest substring without repeating characters. We need an efficient way to keep track of unique characters while iterating through the string.

# Approach
1. Use a sliding window technique with two pointers (`i` and `j`) to represent the current substring.
2. Use a set (`memo`) to track characters currently in the window.
3. Expand the window by moving the end pointer (`j`) to include new characters.
4. If a character is repeated (i.e., already in the set), shrink the window from the start by moving the start pointer (`i`) and removing characters until there are no repeats.
5. Update the maximum length (`res`) whenever a longer unique substring is found.

# Complexity
- Time complexity: $$O(n)$$
  - Each character is added and removed from the set at most once, resulting in linear time complexity.
  
- Space complexity: $$O(min(n, m))$$
  - Where `n` is the length of the input string and `m` is the size of the character set. The space used by the set is proportional to the size of the unique characters in the window.
