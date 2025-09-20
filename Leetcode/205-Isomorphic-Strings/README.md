# 205. Isomorphic Strings

---

## Problem Statement

Given two strings `s` and `t`, determine if they are isomorphic.

Two strings are isomorphic if the characters in `s` can be replaced to get `t`.  
All occurrences of a character must be replaced with another character while preserving the order of characters.  
No two characters may map to the same character, but a character may map to itself.

---

## Examples

### Example 1

**Input:**  
`s = "egg"`, `t = "add"`

**Output:**  
`true`

**Explanation:**

- Mapping `'e'` to `'a'`
- Mapping `'g'` to `'d'`  
  The strings become identical.

---

### Example 2

**Input:**  
`s = "foo"`, `t = "bar"`

**Output:**  
`false`

**Explanation:**  
The character `'o'` would need to map to both `'a'` and `'r'`, which is not allowed.

---

### Example 3

**Input:**  
`s = "paper"`, `t = "title"`

**Output:**  
`true`

---

## Constraints

- `1 <= s.length <= 5 * 10^4`
- `t.length == s.length`
- `s` and `t` consist of any valid ASCII character.
