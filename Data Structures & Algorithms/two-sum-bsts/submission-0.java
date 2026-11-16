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

        boolean result = false; 
        Set<Integer> set = new HashSet<>();

    public boolean twoSumBSTs(TreeNode root1, TreeNode root2, int target) {

        dive(root1);
        compare(root2, target);
        return result;
       
    }

    private void compare(TreeNode node, int target) {
        if(node == null || result) return;

        if(set.contains(target - node.val)){
            result = true;
            return;
        }

        compare(node.left, target);
        compare(node.right, target);

    }

    private void dive(TreeNode node){
        if(node == null) return;

        set.add(node.val);
        dive(node.left);
        dive(node.right);

    }
}
