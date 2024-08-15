# Intuition
To merge two sorted arrays, you can utilize the fact that both arrays are already sorted. Instead of merging them into a new array, we can perform the merge operation directly in one of the original arrays (`nums1`) by starting from the end of the arrays. This avoids the need for additional space and simplifies the merge process.

# Approach
1. **Initialize Pointers**:
   - `i` is set to the last index of the valid elements in `nums1` (i.e., `m - 1`).
   - `j` is set to the last index of `nums2` (i.e., `n - 1`).
   - `k` is set to the last index of the total merged array (i.e., `n + m - 1`).

2. **Merge from End**:
   - Compare elements from the end of `nums1` and `nums2`. Place the larger element at the end of `nums1` and move the pointers accordingly.
   - If `nums1[i]` is greater, place `nums1[i]` at position `k` in `nums1` and decrement both `i` and `k`.
   - Otherwise, place `nums2[j]` at position `k` in `nums1` and decrement both `j` and `k`.

3. **Handle Remaining Elements**:
   - If there are remaining elements in `nums2` (i.e., `j >= 0`), copy them into `nums1` at the appropriate positions.

# Complexity
- Time complexity: $$O(n + m)$$
  - We traverse through both arrays once, where `n` is the length of `nums2` and `m` is the length of the valid elements in `nums1`.

- Space complexity: $$O(1)$$
  - We use constant extra space by performing the merge in-place.
