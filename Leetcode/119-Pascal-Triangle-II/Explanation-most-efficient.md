# Intuition
To generate the `rowIndex`-th row of Pascal's Triangle efficiently, we need to leverage the properties of binomial coefficients. Each row of Pascal's Triangle can be constructed using previously computed values, avoiding the need for factorial calculations, which can be computationally expensive and prone to overflow.

# Approach
1. **Initialization**:
   - Start by initializing a vector `result` with size `rowIndex + 1`, where all elements are set to `1`. This is because the first and last elements of each row in Pascal's Triangle are always `1`.

2. **Iterative Calculation**:
   - Use an iterative approach to compute the values of the row. We only need to compute up to the midpoint of the row due to the symmetry of Pascal’s Triangle. Specifically:
     - For each index `i` from `1` to `rowIndex / 2`, compute the value using:
       ```cpp
       temp = static_cast<long long>(result[i - 1]) * (rowIndex - i + 1);
       temp /= i;
       ```
     - This calculation uses `long long` to handle large intermediate values and avoids overflow.
     - Assign the computed value to both the current index and its symmetric counterpart:
       ```cpp
       result[rowIndex - i] = result[i] = temp;
       ```

3. **Return the Result**:
   - After the loop, the `result` vector contains the `rowIndex`-th row of Pascal's Triangle, which is returned.

# Complexity
- Time complexity: $$O(n)$$
  - The algorithm computes the row in a single pass up to the midpoint, making it linear in terms of the row index.

- Space complexity: $$O(n)$$
  - The space complexity is linear due to the storage required for the `result` vector.

