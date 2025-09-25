# 804. Unique Morse Code Words

---

International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes:

- `'a'` → `".-"`
- `'b'` → `"-..."`
- `'c'` → `"-.-."`
- ...and so on.

For reference, here is the full table for the 26 English letters:

```
[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
 "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
 "..-","...-",".--","-..-","-.--","--.."]
```

Given an array of strings `words`, each word can be written as a concatenation of the Morse code for each letter.

> For example, `"cab"` can be written as `"-.-..--..."`, which is the concatenation of `"-.-."`, `".-"`, and `"-..."`.  
> This concatenation is called the **transformation** of a word.

**Task:**  
Return the number of different transformations among all words.

---

## Examples

### Example 1

**Input:**  
`words = ["gin","zen","gig","msg"]`

**Output:**  
`2`

**Explanation:**  
The transformation of each word is:

- `"gin"` → `"--...-."`
- `"zen"` → `"--...-."`
- `"gig"` → `"--...--."`
- `"msg"` → `"--...--."`

There are 2 different transformations:  
`"--...-."` and `"--...--."`

---

### Example 2

**Input:**  
`words = ["a"]`

**Output:**  
`1`

---

## Constraints

- `1 <= words.length <= 100`
- `1 <= words[i].length <= 12`
- `words[i]` consists of lowercase English letters.
