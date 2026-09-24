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

    boolean result = true;
    public boolean isBalanced(TreeNode root) {

            dive(root);
            return result;

    }

    private int dive(TreeNode node){
        if(node == null) return 0;

        int l = dive(node.left);
        int r = dive(node.right);

        if(Math.abs(l -r) > 1) result = false;

        return 1 + Math.max(l,r);
    }
}
