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

    private int[] nums;

    public boolean isValidSequence(TreeNode root, int[] arr) {
        nums = arr;

        return dive(root, 0);
    }


    private boolean dive(TreeNode node, int index){
        if(node == null || node.val != nums[index]) return false;

        if(nums.length -1 == index){
            if(node.left == null && node.right == null) return true;
            else return false;
        }

        boolean left = dive(node.left, index + 1);
        boolean right = dive(node.right, index + 1);

        return left || right;
    }
}
