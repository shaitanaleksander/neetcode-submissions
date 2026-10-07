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



    public int closestValue(TreeNode root, double target) {
        
        if(root.left != null && root.right != null){

            int left = closestValue(root.left, target);
            int right = closestValue(root.right, target);
            int temp = Math.abs(left - target) > Math.abs(right - target)? right : left;
            return Math.abs(root.val - target) > Math.abs(temp - target)? temp : root.val;
        }
        else if (root.left != null){
            int left = closestValue(root.left, target);
            return Math.abs(root.val - target) > Math.abs(left - target)? left : root.val;
        }
        else if(root.right != null){
            int right = closestValue(root.right, target);
            return Math.abs(root.val - target) > Math.abs(right - target)? right : root.val;
        }
        else return root.val;
    }
}
