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

    private int result = 0;
    public int longestConsecutive(TreeNode root) {
        dive(root,-1,1);
        return result;
    }


    private void dive(TreeNode node, int prev, int counter){
        result = Math.max(result, counter);
        if(node == null){
            return;
        }

        if((node.val - prev) == 1){
            dive(node.left, node.val, counter + 1);
            dive(node.right, node.val, counter + 1);
        }
        else{
            dive(node.left, node.val, 1);
            dive(node.right, node.val, 1);
        }
    }
}
