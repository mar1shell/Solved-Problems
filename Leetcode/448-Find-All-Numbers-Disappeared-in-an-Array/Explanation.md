# Intuition
To find all the numbers between `1` and `n` that are missing from the array `nums`, we can utilize the input array itself to keep track of the numbers we've seen. By marking the presence of each number in the array, we can then identify which numbers are missing.

# Approach
1. **Mark Present Numbers:** Iterate through the `nums` array. For each element `num`, calculate the corresponding index by `abs(num) - 1`. Use this index to mark the presence of the number by setting the value at that index to its negative. This step effectively marks which numbers are present in the array.
   
2. **Identify Missing Numbers:** After marking, iterate through the array again. For each index `i`, if the value at `nums[i]` is positive, it means that `i + 1` was not marked, indicating that `i + 1` is a missing number. Collect these missing numbers into the `result` vector.

# Complexity
- **Time complexity:** $$O(n)$$
  - We make two passes through the array: one for marking the presence and one for collecting the missing numbers.
  
- **Space complexity:** $$O(1)$$
  - We use a constant amount of extra space, excluding the output vector. The input vector is modified in-place.
