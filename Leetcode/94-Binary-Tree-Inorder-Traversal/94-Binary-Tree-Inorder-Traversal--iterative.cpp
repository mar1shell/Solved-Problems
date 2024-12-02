/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    vector<int> inorderTraversal(TreeNode* root) {
        vector<int> result;
        stack<TreeNode *> stack;
        TreeNode *current = root;

        while (current != nullptr || !stack.empty()) {
            while (current != nullptr) {
                stack.push(current);

                current = current->left;
            }

            current = stack.top();
            stack.pop();

            result.push_back(current->val);

            current = current->right;
        }

        return result;
    }
};
