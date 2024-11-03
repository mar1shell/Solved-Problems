# Intuition
This problem is about rotating a linked list to the right by `k` positions. The key insight is that rotating a list by its length `n` or any multiple of `n` results in the same list. So, we can simplify the problem by taking `k % n` steps instead of `k`.

To achieve this, we transform the list into a circular one by connecting its tail to its head. Then, we "break" the circle at the correct position to get the rotated list.

# Approach
1. **Calculate the Length**: Traverse the list to find its length and connect the last node to the head, forming a circular list.
2. **Adjust Rotation**: Compute `k % length` to avoid unnecessary rotations if `k` is greater than the list length.
3. **Locate the New Head**: To rotate the list by `k` steps, the new head is at the `length - (k % length)` position.
4. **Break the Circle**: Traverse to the node just before the new head and set its `next` pointer to `nullptr`, effectively breaking the circle.

# Complexity
- **Time complexity**: $$O(n)$$, where $$n$$ is the length of the linked list. We traverse the list twice — once to compute its length and another time to find the new head.
- **Space complexity**: $$O(1)$$, as we are only using a few extra pointers for traversal.
