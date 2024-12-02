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
    vector<int> preorderTraversal(TreeNode* root) {
        vector<int> result;
        stack<TreeNode *> stack;

        stack.push(root);

        while (!stack.empty()) {
            TreeNode *current = stack.top();
            
            if (root == nullptr) {
                return result;
            }
            
            stack.pop();
            result.push_back(current->val);

            if (current->right != nullptr) {
                stack.push(current->right);
            }

            if (current->left != nullptr) {
                stack.push(current->left);
            }
        }

        return result;
    }
};
