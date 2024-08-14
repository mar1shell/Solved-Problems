# Intuition
To generate Pascal's Triangle, we need to compute the binomial coefficients for each row. Each entry in a row corresponds to the binomial coefficient `C(n, k)` where `n` is the row index and `k` is the position in that row. Directly calculating factorials for large numbers can be inefficient and may lead to overflow. Instead, we can compute each binomial coefficient iteratively to avoid these issues.

# Approach
1. **Iterative Calculation of Binomial Coefficient**:
   - Compute the binomial coefficient `C(n, k)` without calculating large factorials. We use the formula:
     ```
     C(n, k) = n! / (k! * (n - k)!)
     ```
   - Instead of calculating factorials directly, we use the iterative approach:
     ```
     C(n, k) = (n * (n - 1) * ... * (n - k + 1)) / (k * (k - 1) * ... * 1)
     ```
   - This avoids large intermediate results by performing the multiplication and division in each step.

2. **Generating Pascal's Triangle**:
   - For each row from 0 to `numRows - 1`, compute the binomial coefficients for that row using the `binomial_coeff` function.
   - Store these coefficients in a 2D vector to represent Pascal's Triangle.

3. **Optimize Computation**:
   - Use the property that `C(n, k) = C(n, n - k)` to reduce the number of computations when `k` is larger than `n - k`.

# Complexity
- **Time complexity**: `O(numRows^2)`
  - We compute each binomial coefficient for every row, resulting in `O(numRows^2)` operations overall.

- **Space complexity**: `O(numRows^2)`
  - The space required to store the entire Pascal's Triangle with `numRows` rows is proportional to the number of entries, which is `O(numRows^2)`.
