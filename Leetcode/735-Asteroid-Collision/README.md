# 735. Asteroid Collision

---

## Problem Description

Given an array `asteroids` of integers representing asteroids in a row, where:

- The index represents the asteroid's position in space.
- The absolute value represents its size.
- The sign indicates direction: positive (→ right), negative (← left).
- All asteroids move at the same speed.

Asteroids collide as follows:

- If two asteroids meet, the smaller one explodes.
- If both are the same size, both explode.
- Asteroids moving in the same direction never meet.

Find the state of the asteroids after all collisions.

---

## Examples

**Example 1**

```
Input: asteroids = [5, 10, -5]
Output: [5, 10]
Explanation: 10 and -5 collide; 10 survives. 5 and 10 never collide.
    -1000 <= asteroids[i] <= 1000
```

**Example 2**

```
Input: asteroids = [8, -8]
Output: []
Explanation: 8 and -8 collide; both explode.
```

**Example 3**

```
Input: asteroids = [10, 2, -5]
Output: [10]
Explanation: 2 and -5 collide; -5 survives. 10 and -5 collide; 10 survives.
```

---

## Constraints

- `2 <= asteroids.length <= 10^4`
- `-1000 <= asteroids[i] <= 1000`
- `asteroids[i] != 0`
