# Solution 1: Brute-Force Approach

## Intuition
This brute-force approach involves iterating through each node in list `A`. For each node in list `A`, it then iterates through every node in list `B` to check if they are the same. If a matching node is found, it is returned as the intersection node.

## Approach
1. Iterate through each node in list `A`.
2. For each node in list `A`, iterate through all nodes in list `B`.
3. Compare nodes from both lists. If a node from `A` matches a node from `B`, return that node as the intersection.
4. If no intersection is found after traversing all nodes, return `nullptr`.

## Complexity
- Time complexity: $$O(m \cdot n)$$, where `m` is the length of list `A` and `n` is the length of list `B`. This results from the nested loops, leading to quadratic time complexity.
- Space complexity: $$O(1)$$, as no extra space is used beyond the input lists.

## Notes
- **Efficiency:** This approach is straightforward but inefficient for large lists due to its high time complexity.
- **Simplicity:** The method is easy to understand and implement but may not be practical for scenarios with larger lists where performance is a concern.

## Code
```cpp
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        if (headA == nullptr || headB == nullptr) {
            return nullptr;
        }

        ListNode *tempA = headA;

        while (tempA != nullptr) {
            ListNode *tempB = headB;
            while (tempB != nullptr) {
                if (tempA == tempB) {
                    return tempA;
                }
                tempB = tempB->next;
            }

            tempA = tempA->next;
        }

        return nullptr;
    }
};
```

# Solution 2: Hash Set Approach

## Intuition
This approach leverages a hash set to track the nodes visited in one list. By storing nodes from list `A` in a hash set, we can efficiently check if a node from list `B` is in the set, identifying the intersection point if it exists.

## Approach
1. Initialize a hash set to store nodes from list `A`.
2. Traverse list `A`, adding each node to the hash set.
3. Traverse list `B`, checking each node to see if it is present in the hash set.
4. If a node from list `B` is found in the hash set, return that node as the intersection.
5. If no intersection is found after traversing both lists, return `nullptr`.

## Complexity
- Time complexity: $$O(m + n)$$, where `m` is the length of list `A` and `n` is the length of list `B`. The traversal of both lists and the hash set operations contribute to linear time complexity.
- Space complexity: $$O(m)$$, where `m` is the number of nodes in list `A`. This is due to the space required to store the nodes in the hash set.

## Notes
- **Efficiency:** This approach is efficient in terms of time complexity and is well-suited for larger lists due to its linear time complexity.
- **Space Usage:** It uses extra space proportional to the number of nodes in list `A`, which might be a consideration for memory-constrained environments.

## Code
```cpp
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        if (headA == nullptr || headB == nullptr) {
            return nullptr;
        }

        ListNode *tempA = headA, *tempB = headB;
        unordered_set<ListNode *> memo;

        while (tempA != nullptr || tempB != nullptr) {
            if (tempA != nullptr) {
                if (memo.find(tempA) != memo.end()) {
                    return tempA;
                } else {
                    memo.insert(tempA);
                    tempA = tempA->next;
                }
            }

            if (tempB != nullptr) {
                if (memo.find(tempB) != memo.end()) {
                    return tempB;
                } else {
                    memo.insert(tempB);
                    tempB = tempB->next;
                }
            }
        }
        
        return nullptr;
    }
};
```

# Solution 3: Length Difference Approach

## Intuition
This approach calculates the lengths of both linked lists and adjusts the starting point of the longer list so that both lists are equally far from their end. This alignment allows for a simultaneous traversal to find the intersection.

## Approach
1. Traverse list `A` to calculate its length.
2. Traverse list `B` to calculate its length.
3. Compute the difference in lengths between the two lists.
4. Adjust the starting point of the longer list by advancing it by the length difference.
5. Traverse both lists simultaneously. If nodes from both lists match, return the intersection node.
6. If no intersection is found, return `nullptr`.

## Complexity
- Time complexity: $$O(m + n)$$, where `m` is the length of list `A` and `n` is the length of list `B`. The approach involves traversing both lists twice.
- Space complexity: $$O(1)$$, as the approach uses no extra space beyond the input lists.

## Notes
- **Efficiency:** This approach is efficient with linear time complexity and constant space complexity.
- **Practicality:** It is practical for cases where the lengths of the lists are known or can be computed, avoiding the need for extra space.

## Code
```cpp
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        if (headA == nullptr || headB == nullptr) {
            return nullptr;
        }

        ListNode *tempA = headA, *tempB = headB;
        int lenA = 0, lenB = 0;

        while (tempA != nullptr) {
            tempA = tempA->next;
            lenA++;
        }

        while (tempB != nullptr) {
            tempB = tempB->next;
            lenB++;
        }

        tempA = headA, tempB = headB;
        int diffLength = lenA - lenB;

        if (diffLength > 0) {
            for (int i = 0; i < diffLength; i++) {
                tempA = tempA->next; 
            }
        } else if (diffLength < 0) {
            for (int i = 0; i < -diffLength; i++) {
                tempB = tempB->next; 
            }
        }

        while (tempA != nullptr) {
            if (tempA == tempB) {
                return tempA;
            }

            tempA = tempA->next;
            tempB = tempB->next;
        }

        return nullptr;
    }
};
```
# Solution 4: Two-Pointer Approach with List Traversal

## Intuition
This approach uses two pointers, one starting from each list, and switches them to the other list once they reach the end. By doing this, both pointers will traverse the same combined length of both lists, aligning them to meet at the intersection point if one exists.

## Approach
1. Initialize two pointers, `tempA` and `tempB`, starting at the heads of list `A` and list `B`, respectively.
2. Traverse both lists simultaneously. When a pointer reaches the end of a list, switch it to the head of the other list.
3. Continue the traversal until both pointers either meet at the intersection node or reach the end of both lists simultaneously.
4. If the pointers meet, return the intersection node. If they both reach the end of both lists without meeting, return `nullptr`.

## Complexity
- Time complexity: $$O(m + n)$$, where `m` is the length of list `A` and `n` is the length of list `B`. The traversal of each list twice results in linear time complexity.
- Space complexity: $$O(1)$$, as the approach uses no extra space beyond the two pointers.

## Notes
- **Efficiency:** This approach is efficient with linear time complexity and constant space complexity.
- **Alignment:** By switching lists when reaching the end, the approach ensures that both pointers have traveled the same total distance, facilitating the detection of the intersection.

## Code
```cpp
class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        if (headA == nullptr || headB == nullptr) {
            return nullptr;
        }

        int flag1 = 1, flag2 = 1;
        ListNode *tempA = headA, *tempB = headB;
        
        while (tempA != nullptr || tempB != nullptr) {
            if (tempA == tempB) {
                return tempA;
            }

            tempA = tempA->next, tempB = tempB->next;

            if (tempA == nullptr) {
                if (flag1) {
                    tempA = headB;
                    flag1 = 0;
                } else {
                    return nullptr;
                }
            }

            if (tempB == nullptr) {
                if (flag2) {
                    tempB = headA;
                    flag2 = 0;
                } else {
                    return nullptr;
                }
            }
        }

        return nullptr;
    }
};
```
