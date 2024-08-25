# Intuition
To determine the number of steps required to reduce a number to zero by repeatedly performing specific operations, we need to understand how the number of bits and the number of `1` bits (set bits) affect the number of operations.

# Approach
1. **Bit Length Calculation**:
   - The bit length of a number tells us the number of bits needed to represent it in binary. We calculate this using the base-2 logarithm of the number.
   - `bitLength` is computed using `log2(num)` which gives us the highest bit position. We then use `floor` to round down to the nearest whole number and add `1` to get the total number of bits.

2. **Bit Count Calculation**:
   - The number of `1` bits in the binary representation of a number represents how many subtraction operations are required.
   - We use `__builtin_popcount(num)` to count the number of set bits (i.e., `1` bits) in the number.

3. **Combine Results**:
   - The total number of steps is the sum of:
     - The number of bit shifts required to reduce the number to a single bit (`bitLength - 1`).
     - The number of subtraction operations needed to clear all `1` bits (`bitCount`).

4. **Edge Case**:
   - If the input number is `0`, no steps are needed, so the function returns `0`.

# Complexity
- **Time complexity**: `O(log n)` due to the logarithmic calculation and bit counting.
- **Space complexity**: `O(1)` as we use a constant amount of extra space.
