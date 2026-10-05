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
    public boolean isValidBST(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();

        dive(root, nodes);

        for (int i = 1; i < nodes.size(); i++) {
            if (nodes.get(i - 1) >= nodes.get(i))
                return false;
        }

        return true;
    }

    private void dive(TreeNode node, List<Integer> nums) {
        if (node == null)
            return;

        dive(node.left, nums);
        nums.add(node.val);
        dive(node.right, nums);
    }
}
