# 138. Copy List with Random Pointer

Given a linked list of length `n`, where each node contains an additional `random` pointer (which can point to any node in the list or `null`), construct a **deep copy** of the list.

The deep copy should consist of exactly `n` brand new nodes, each with its value set to the corresponding original node. Both the `next` and `random` pointers of the new nodes should point to new nodes in the copied list, preserving the same structure as the original. No pointer in the new list should reference any node from the original list.

For example, if there are two nodes `X` and `Y` in the original list, where `X.random → Y`, then in the copied list, the corresponding nodes `x` and `y` should have `x.random → y`.

**Return** the head of the copied linked list.

The linked list is represented in the input/output as a list of `n` nodes. Each node is represented as a pair `[val, random_index]` where:

- `val`: Integer representing `Node.val`
- `random_index`: Index of the node (`0` to `n-1`) that the `random` pointer points to, or `null` if it does not point to any node.

Your code will only be given the head of the original linked list.

---

## Examples

**Example 1**

![Copy List with Random Pointer Example](https://assets.leetcode.com/uploads/2019/12/18/e1.png)

```
Input:  head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
```

**Example 2**

![Copy List with Random Pointer Example](https://assets.leetcode.com/uploads/2019/12/18/e2.png)

```
Input:  head = [[1,1],[2,1]]
Output: [[1,1],[2,1]]
```

**Example 3**

![Copy List with Random Pointer Example](https://assets.leetcode.com/uploads/2019/12/18/e3.png)

```
Input:  head = [[3,null],[3,0],[3,null]]
Output: [[3,null],[3,0],[3,null]]
```

---

## Constraints

- `0 <= n <= 1000`
- `-10^4 <= Node.val <= 10^4`
- `Node.random` is `null` or points to some node in the linked list
