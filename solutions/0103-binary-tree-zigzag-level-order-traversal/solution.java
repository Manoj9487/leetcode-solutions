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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftRight = true;
        while(!queue.isEmpty()) {
            int size = queue.size();
            Integer[] subList = new Integer[size];

            for(int i = 0; i < size; i++) {
                TreeNode node = queue.peek();
                queue.poll();

                int index = (leftRight) ? i : size - i - 1;

                subList[index] = node.val;

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);

            }
            leftRight = !leftRight;
            res.add(Arrays.asList(subList));
        }
        return res;

    }
}
