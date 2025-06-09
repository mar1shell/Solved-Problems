# Intuition

The goal is to make the XOR of all elements in the array equal to `k`.  
To achieve this, we need to flip bits in the result. The number of operations required corresponds to how many bits differ between the current XOR of the array and the target `k`.

# Approach

1. Compute the XOR of all elements in `nums`.
2. If the XOR result is already equal to `k`, return `0`.
3. Otherwise, XOR the result with `k` to find the positions where the bits differ.
4. Convert this difference into a binary string and count the number of `'1'` bits — each represents one required operation (bit flip).
5. Return this count.

# Complexity

- Time complexity:  
  $$O(n)$$ — A single pass through the array to compute the XOR, and bit counting is constant time.

- Space complexity:  
  $$O(1)$$ — Only a few variables are used.
