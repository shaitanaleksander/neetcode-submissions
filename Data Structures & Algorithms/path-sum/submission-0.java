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
    public boolean hasPathSum(TreeNode root, int targetSum) {

            return dive(root, targetSum, 0);

    }


    private boolean dive(TreeNode root, int target, int acum){
        if(root == null) return false;
        acum += root.val;
        if(root.left == null && root.right == null) return acum == target;            

        return dive(root.left, target, acum) || dive(root.right, target, acum);


    }
}