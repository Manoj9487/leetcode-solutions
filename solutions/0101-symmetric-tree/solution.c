/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

 bool check(struct TreeNode *left, struct TreeNode *right) {
    if (left == NULL && right == NULL) {
        return true;
    }
    else if (left == NULL || right == NULL) {
        return false;
    }
    else if (left->val != right->val) {
        return false;
    }
    else {
        return check(left->left, right->right) && check(left->right, right->left);
    }
 }
bool isSymmetric(struct TreeNode* root) {
    if (root == NULL) 
    return true;
    return check(root->left, root->right);
}
