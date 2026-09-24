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

    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dive(root);
        return max;
    }


    private int dive(TreeNode root){

        if(root == null) return 0;

        int l  = dive(root.left);
        int r  = dive(root.right);

        int sum = r + l;
        max  = max > sum ? max : sum;

        return 1 + Math.max(r,l);


    }
}
