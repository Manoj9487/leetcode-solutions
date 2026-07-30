/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private void markParent(TreeNode root, Map<TreeNode, TreeNode> parentTrack) {

        Queue<TreeNode> queue = new LinkedList<>();   // BFS Traversal
        queue.offer(root);

        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.left != null) {
                queue.offer(node.left);
                parentTrack.put(node.left, node);
            }
            if (node.right != null) {
                queue.offer(node.right);
                parentTrack.put(node.right, node);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        Map<TreeNode, TreeNode> parentTrack = new HashMap<>();
        markParent(root, parentTrack);

        Map<TreeNode, Boolean> visited = new HashMap<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(target);
        visited.put(target, true);
        int currLevel = 0;

        while(!queue.isEmpty()) {

            if (currLevel == k) break;
            currLevel++;

            int size = queue.size();

            for(int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();

                if (curr.left != null && visited.get(curr.left) == null) {
                    queue.offer(curr.left);
                    visited.put(curr.left, true);
                }
                if (curr.right != null && visited.get(curr.right) == null) {
                    queue.offer(curr.right);
                    visited.put(curr.right, true);
                }
                if (parentTrack.get(curr) != null && visited.get(parentTrack.get(curr)) == null) {
                    queue.offer(parentTrack.get(curr));
                    visited.put(parentTrack.get(curr), true);
                }
            }
        }

        List<Integer> ans = new ArrayList<>();

        while(!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            ans.add(curr.val);
        }

        return ans;
    }
}
