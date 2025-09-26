# 1310. XOR Queries of a Subarray

Given an array `arr` of positive integers and an array `queries` where `queries[i] = [left_i, right_i]`, compute the XOR of elements from `left_i` to `right_i` for each query.

Return an array `answer` where `answer[i]` is the result for the `i`-th query.

---

## Example 1

**Input:**  
`arr = [1, 3, 4, 8]`  
`queries = [[0, 1], [1, 2], [0, 3], [3, 3]]`

**Output:**  
`[2, 7, 14, 8]`

**Explanation:**

| Index | Value | Binary |
| ----- | ----- | ------ |
| 0     | 1     | 0001   |
| 1     | 3     | 0011   |
| 2     | 4     | 0100   |
| 3     | 8     | 1000   |

- `[0, 1]`: 1 XOR 3 = 2
- `[1, 2]`: 3 XOR 4 = 7
- `[0, 3]`: 1 XOR 3 XOR 4 XOR 8 = 14
- `[3, 3]`: 8

---

## Example 2

**Input:**  
`arr = [4, 8, 2, 10]`  
`queries = [[2, 3], [1, 3], [0, 0], [0, 3]]`

**Output:**  
`[8, 0, 4, 4]`

---

## Constraints

- `1 <= arr.length, queries.length <= 3 * 10^4`
- `1 <= arr[i] <= 10^9`
- `queries[i].length == 2`
- `0 <= left_i <= right_i < arr.length`
