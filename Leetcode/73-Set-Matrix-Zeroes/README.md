# 73. Set Matrix Zeroes

Given an `m x n` integer matrix `matrix`, if an element is `0`, set its entire row and column to `0`s.

You must do it **in place**.

---

## Example 1

![Set Matrix Zeroes Example](https://assets.leetcode.com/uploads/2020/08/17/mat1.jpg)

**Input:**  
`matrix = [[1,1,1],[1,0,1],[1,1,1]]`

**Output:**  
`[[1,0,1],[0,0,0],[1,0,1]]`

---

## Example 2

![Set Matrix Zeroes Example](https://assets.leetcode.com/uploads/2020/08/17/mat2.jpg)

**Input:**  
`matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]`

**Output:**  
`[[0,0,0,0],[0,4,5,0],[0,3,1,0]]`

---

## Constraints

- `m == matrix.length`
- `n == matrix[0].length`
- `1 <= m, n <= 200`
- `-2^{31} <= matrix[i][j] <= 2^{31} - 1`
