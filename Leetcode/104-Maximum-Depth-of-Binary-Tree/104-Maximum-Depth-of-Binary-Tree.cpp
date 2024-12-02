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
    int maxDepthRec(TreeNode *root, int counter) {
        if (root == nullptr) {
            return counter;
        }

        counter++;
        return max(maxDepthRec(root->left, counter), maxDepthRec(root->right, counter));
    }
public:
    int maxDepth(TreeNode* root) {
        return maxDepthRec(root, 0);
    }
};
