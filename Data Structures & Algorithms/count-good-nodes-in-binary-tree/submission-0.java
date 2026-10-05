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

    public int goodNodes(TreeNode root) {

        dive(root, Integer.MIN_VALUE);
    
        return result;
    }

    private void dive(TreeNode node, int max){
        if(node == null) return;

        if(node.val >= max) result++;
        
        max =  Math.max(node.val, max);

        dive(node.left, max);
        dive(node.right, max);


    }
}
