# Intuition
The problem requires removing duplicates from a sorted array. My initial thought is to use a two-pointer approach. One pointer (`i`) will track the position for the next unique element, while the other pointer (`j`) will traverse the array to find unique elements.

# Approach
1. **Initialization:** Start with two pointers: `i` at position `0` and `j` at position `1`. The pointer `i` keeps track of the position to place the next unique element, and `j` is used to scan through the array.
2. **Traversal:** Iterate through the array with `j`. For each element, if it is different from the element at position `i`, increment `i` and place the current element at `nums[i]`.
3. **Return Length:** After processing the array, the length of the array with unique elements is `i + 1`, which will be returned.

# Complexity
- Time complexity: $$O(n)$$
- Space complexity: $$O(1)$$
