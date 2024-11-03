/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* prev;
    Node* next;
    Node* child;
};
*/

class Solution {
    // Recursive function to flatten the multilevel linked list
    void solve(Node *head, Node *next) {
        Node *temp = head; // Pointer to traverse the current list
        Node *last = head; // Pointer to track the last node in the current list
        
        // Traverse until we find a child or reach the end of the list
        while (temp != nullptr) {
            // If a child node is found, exit the loop
            if (temp->child != nullptr) {
                break;
            }
            
            last = temp; // Update the last pointer to the current node
            temp = temp->next; // Move to the next node
        }

        // If no child was found (temp is null), set up connections
        if (temp == nullptr) {
            if (last != nullptr) {
                last->next = next; // Link the last node's next to the next parameter
            }

            if (next != nullptr) {
                next->prev = last; // Link the next node's prev to the last node
            }

            return; // Exit the function as there's nothing more to do
        }

        // Recursively flatten the child list, passing the next node
        solve(temp->child, temp->next);
        
        // If there is a next node, flatten it as well
        if (temp->next != nullptr) {
            solve(temp->next, next); 
        } else {
            // If there is no next node, continue with the child so we can connect it to the original next
            solve(temp->child, next);
        }
        
        // Connect the flattened child list to the current node
        temp->next = temp->child;

        // If the child is not null, link it back to the current node
        if (temp->child != nullptr) {
            temp->child->prev = temp; // Set the child's previous pointer
            temp->child = nullptr; // Clear the child pointer in the current node
        }
    }
public:
    // Main function to flatten the multilevel linked list
    Node* flatten(Node* head) {
        // If the head is null, return null
        if (head == nullptr) {
            return head; 
        }

        // Start the flattening process from the head
        solve(head, nullptr); 

        // Return the head of the flattened list
        return head; 
    }
};
