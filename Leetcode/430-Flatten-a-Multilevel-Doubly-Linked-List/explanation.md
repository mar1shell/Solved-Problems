# Intuition
The goal is to flatten a multilevel doubly linked list into a single-level doubly linked list. Each node may have a `child` pointer that points to another list, which we need to include in the flattened list while maintaining the correct order.

# Approach
1. **Recursive Traversal**: We will use a recursive function `solve` that processes each node. This function will traverse the list and handle child nodes as they are encountered.
2. **Finding the Last Node**: During the traversal, we will keep track of the last node visited. If we find a `child`, we will recursively call `solve` to flatten that child list before continuing to the next node.
3. **Linking Nodes**: After flattening the child list, we will link the last node from the flattened child list back to the current node and set the `child` pointer to `nullptr`.

# Complexity
- **Time Complexity**: 
    - $$O(n)$$, where $$n$$ is the total number of nodes in all levels of the multilevel list. Each node is visited exactly once.
  
- **Space Complexity**: 
    - $$O(h)$$, where $$h$$ is the height of the recursion stack. In the worst case, the height of the recursion stack can be proportional to the number of nodes in the longest child list.
