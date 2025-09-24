# 2351. First Letter to Appear Twice

Given a string `s` consisting of lowercase English letters, return the first letter to appear twice.

**Note:**

- A letter `a` appears twice before another letter `b` if the second occurrence of `a` is before the second occurrence of `b`.
- `s` will contain at least one letter that appears twice.

---

## Examples

### Example 1

**Input:**  
`s = "abccbaacz"`

**Output:**  
`"c"`

**Explanation:**

- The letter `'a'` appears at indexes 0, 5, and 6.
- The letter `'b'` appears at indexes 1 and 4.
- The letter `'c'` appears at indexes 2, 3, and 7.
- The letter `'z'` appears at index 8.

The letter `'c'` is the first to appear twice, because its second occurrence has the smallest index among all letters.

---

### Example 2

**Input:**  
`s = "abcdd"`

**Output:**  
`"d"`

**Explanation:**  
The only letter that appears twice is `'d'`, so we return `'d'`.

---

## Constraints

- `2 <= s.length <= 100`
- `s` consists of lowercase English letters.
- `s` has at least one repeated letter.
