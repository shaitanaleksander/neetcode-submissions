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
    private int steps = 0;

    public int distributeCoins(TreeNode root) {

        dive(root);

        return steps;
    }

    private int dive(TreeNode node){
        if(node == null) return 0;

        int left = dive(node.left);
        int right = dive(node.right);

        steps+= Math.abs(left);
        steps+= Math.abs(right);
        
        return left + right + (node.val - 1);

    }
}
