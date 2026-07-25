/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum = 0;
    private void dfs(TreeNode node, TreeNode parent, TreeNode grand) {
        if (node == null) return;

        if (grand != null && grand.val % 2 == 0) {
            sum += node.val;
        }
        dfs(node.left, node, parent);
        dfs(node.right, node, parent);
    }
    public int sumEvenGrandparent(TreeNode root) {
        dfs(root, null, null);
        return sum;
    }
}
