# 119. Pascal's Triangle II

**Problem Description**

Given an integer `rowIndex`, return the `rowIndex`-th (0-indexed) row of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

![Pascal's Triangle](https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif)

## Examples:

**Example 1:**

Input: `rowIndex = 3`

Output: `[1, 3, 3, 1]`

**Example 2:**

Input: `rowIndex = 0`

Output: `[1]`

**Example 3:**

Input: `rowIndex = 1`

Output: `[1, 1]`

## Constraints:

- `0 <= rowIndex <= 33`

**Follow up:**

Could you optimize your algorithm to use only O(rowIndex) extra space?